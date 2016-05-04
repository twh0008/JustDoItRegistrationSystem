package professor.entergrades;

import java.sql.ResultSet;
import java.sql.SQLException;

import support.Course;
import support.DBConnect;
import support.Professor;

public class EnterGradesModel {

	private Professor prof;
	private int userid;
	private String grade;
	private int crn;
	
	public EnterGradesModel(Professor prof){
		this.prof = prof;
	}
	
	public void setCrn(int crn) {
		this.crn = crn;
		
	}
	public void setId(int userid) {
		this.userid = userid;
		
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public boolean addGrade(){
		ResultSet rs;
		String schedule = "";
		String grades = "";
		String coursename = "";
		DBConnect db = new DBConnect();
		db.connect();
		String sql = "SELECT schedule, grades FROM users WHERE userid='"
				+ userid + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		rs = db.getRs();
		
		try {
			if(rs.next()){
				grades = rs.getString("grades");
				schedule = rs.getString("schedule");
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "SELECT coursename FROM courses WHERE courseid='"
				+ crn + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		rs = db.getRs();
		try {
			if(rs.next()){
				coursename = rs.getString("coursename");
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] coursesArray = schedule.split("\\s+");
		String[] gradesArray = grades.split("\\s+");
		
		for(int i = 0; i < coursesArray.length; i++){
			if(coursesArray[i].contains(coursename)){
				gradesArray[i-1] = grade;
				System.out.println("LOOPS");
				break;
			}	
		}
		String newGrades = "";
		for(String s : gradesArray){
			System.out.println(s);
			newGrades += s + " ";
		}
		//Grades update
		sql = "UPDATE users"
				+ " SET grades ='" + newGrades + "' WHERE userid='" 
				+ userid + "'";
		db.setSqlquery(sql);
		db.dbUpdate();
		
		db.disconnect();
		return true;
	}



}
