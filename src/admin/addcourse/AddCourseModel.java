package admin.addcourse;

import java.sql.*;



import support.*;

public class AddCourseModel {

	private String courseName;
	private String courseCap;
	private String courseCredits;
	private String courseDate;
	private String courseTime;
	private String courseTerm;

	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public void setCourseCap(String courseCap){
		this.courseCap = courseCap;
	}
	
	public void setCourseCredits(String courseCredits){
		this.courseCredits = courseCredits;
	}
	
	public void setCourseDate(String courseDate){
		this.courseDate = courseDate;
	}
	
	public void setCourseTime(String courseTime){
		this.courseTime = courseTime;
	}
	
	public void setCourseTerm(String courseTerm){
		this.courseTerm = courseTerm;
	}
	
	public boolean createCourse() {
		try {
		DBConnect db = new DBConnect();
		Connection conn = db.connect();
		
		String sql = " INSERT INTO `teamredt_justdoit`.`courses`(coursename, coursecap, coursecredits, coursedate, coursetime, term)"
				+ " values (?,?,?,?,?,?)";
		
		java.sql.PreparedStatement preparedStmt = conn.prepareStatement(sql);
	      preparedStmt.setString (1, courseName);
	      preparedStmt.setString (2, courseCap);
	      preparedStmt.setString (3, courseCredits);
	      preparedStmt.setString (4, courseDate);
	      preparedStmt.setString (5, courseTime);
	      preparedStmt.setString (6, courseTerm);
	      
	      preparedStmt.execute();
	      conn.close();
	      return true;
	      
		} catch (Exception e) {
			System.err.println("Exception!");
			return false;
		}
			
	}
		
		


	
}