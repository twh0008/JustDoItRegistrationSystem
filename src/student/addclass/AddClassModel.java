package student.addclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import support.DBConnect;
import support.Student;

public class AddClassModel {
	private Student student;
	private String coursename;
	private int credits;
	private int size;
	
	public AddClassModel(Student student){
		
		this.student = student;
		coursename = "-1";
		credits = 0;
		
	}
	
	public boolean addClass(int crn){
		if(!checkUser(crn)){return false;}
		if(student.getSchedule().getCourses().contains(coursename.trim())){return false;}
		student.getSchedule().setCredits(credits+student.getSchedule().getCredits());
		
		student.getSchedule().addCourse(coursename);
		ArrayList<String> cl = student.getSchedule().getCourses();
		String newSchedule = "";
		for (String s : cl)
		{
		    newSchedule += s + " ";
		}
		
		DBConnect db = new DBConnect();
		db.connect();
		
		//Update user schedule
		String sql = "UPDATE users"
				+ " SET schedule = '" + newSchedule + "' WHERE userid='" 
				+ student.getUserId() + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		//Update user credits
		sql = "UPDATE users"
				+ " SET credits = '" + (student.getSchedule().getCredits()) + "' WHERE userid='" 
				+ student.getUserId() + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		//update enrolled students
		sql = "UPDATE courses"
				+ " SET studentsenrolled=( CASE WHEN studentsenrolled= ''"
				+ " THEN '" + student.getUserId() 
				+ "' ELSE concat(studentsenrolled, ' " 
				+ student.getUserId() + "') END) WHERE courseid='" +crn +"'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		//update size of class
		sql = "UPDATE courses"
				+ " SET coursesize = '" + (size+1) + "' WHERE courseid='" 
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		db.disconnect();
		return true;
	}

	private boolean checkUser(int crn) {
		if(!student.isRegStatus()){
			return false;
		}

		int cap = 0;
		DBConnect db = new DBConnect();
		db.connect();
		String sql = "SELECT coursecap, coursesize, coursecredits, coursename "
				+ "FROM courses WHERE courseid='" 
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		ResultSet rs = db.getRs();
		
		try {
			if(rs.next()){
				cap = rs.getInt("coursecap");
				size = rs.getInt("coursesize");
				credits = rs.getInt("coursecredits");
				this.coursename = rs.getString("coursename");
				if((size == cap) || (credits + student.getSchedule().getCredits() 
								> student.getSchedule().getMaxCredits())){
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.disconnect();
		return true;
	}
}
