package student.dropclass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import support.DBConnect;
import support.Student;

public class DropClassModel {

	private Student student;
	private String coursename;
	private int credits;
	private int size;
	private String enrolledStudents;
	
	public DropClassModel(Student user) {
		student = user;
		coursename = "-1";
		credits =0 ;
		size = 0;
		enrolledStudents = "-1";
	}

	public boolean DropClass(int crn) {
		if(!student.isRegStatus()){return false;}
		DBConnect db = new DBConnect();
		db.connect();
		String sql = "SELECT coursecap, coursesize, coursecredits, coursename, studentsenrolled "
				+ "FROM courses WHERE courseid='" 
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		ResultSet rs = db.getRs();
		try {
			if(rs.next()){
				size = rs.getInt("coursesize");
				credits = rs.getInt("coursecredits");
				coursename = rs.getString("coursename");
				enrolledStudents = rs.getString("studentsenrolled");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!(student.getSchedule().getCourses().contains(coursename.trim()))){
			return false;
		}
		student.getSchedule().setCredits(student.getSchedule().getCredits()-credits);
		
		
		student.getSchedule().removeCourse(coursename);
		ArrayList<String> cl = student.getSchedule().getCourses();
		String newSchedule = "";
		for (String s : cl)
		{
		    newSchedule += s + " ";
		}

		String[] students = enrolledStudents.split("\\s+");
		String newEnrolled = "";
		for(String s : students){
			if(Integer.parseInt(s) == student.getUserId()){
				continue;
			}
			newEnrolled += s + " ";
		}
		//Update user schedule
		sql = "UPDATE users"
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
				+ " SET studentsenrolled = '" + newEnrolled + "' WHERE courseid='" 
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		//update size of class
		sql = "UPDATE courses"
				+ " SET coursesize = '" + (size-1) + "' WHERE courseid='" 
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		db.disconnect();
		return true;
	}

}
