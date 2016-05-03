package registration.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import student.homepage.StudentHomeController;
import student.homepage.StudentView;
import support.Administrator;
import support.DBConnect;
import support.Professor;
import support.ProfessorSchedule;
import support.Schedule;
import support.Student;
import support.StudentSchedule;
import support.User;


public class LoginModel {

	private String username;
	private char[] password;

	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(char[] password2){
		this.password = password2;
	}
	public User verifyAccount(){
		int type = -1;
		User user = null;
		DBConnect db = new DBConnect();
		db.connect();
		String sql = "SELECT usertype FROM users WHERE username='" 
				+ username + "' and password='" + new String(password) + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		ResultSet rs = db.getRs();
		try {
			if(rs.next()){
				type = rs.getInt("usertype");
				user = createAccount(db, type);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.disconnect();
		return user;
	}
	
	private User createAccount(DBConnect db, int type){
		ResultSet rs = null;
		String sql = "SELECT * FROM users WHERE username='" 
				+ username + "' and password='" + new String(password) + "'";
		User user = null;
		switch(type){
		case 2:
			db.setSqlquery(sql);
			db.dbExecute();
			rs = db.getRs();
			try {
				if(rs.next()){
					String schedule = rs.getString("schedule");
					String grades = rs.getString("grades");
					String[] courses = schedule.split("\\s+");
					String[] coursesGrades = grades.split("\\s+");
					int credits = rs.getInt("credits");
					ArrayList<String> crsGrades = new ArrayList<String>(Arrays.asList(coursesGrades));
					ArrayList<String> crs = new ArrayList<String>(Arrays.asList(courses));
					Schedule sch = new StudentSchedule(crs, credits, 18, crsGrades);
					user = new Student(rs.getString("firstname"), rs.getString("lastname"), rs.getString("username")
							, rs.getString("password"), type, rs.getInt("userid")
							, rs.getBoolean("regstatus"), credits, rs.getDouble("gpa")
							, sch);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 1:
			db.setSqlquery(sql);
			db.dbExecute();
			rs = db.getRs();
			try {
				if(rs.next()){
					String schedule = rs.getString("schedule");
					String[] courses = schedule.split("\\s+");
					ArrayList<String> crs = new ArrayList<String>(Arrays.asList(courses));
					ProfessorSchedule sch = new ProfessorSchedule(crs);
					user = new Professor(rs.getString("firstname"), rs.getString("lastname"), rs.getString("username")
							, rs.getString("password"), type, rs.getInt("userid")
							, sch);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 0:
			db.setSqlquery(sql);
			db.dbExecute();
			rs = db.getRs();
			try {
				if(rs.next()){
					user = new Administrator(rs.getString("firstname"), rs.getString("lastname"), rs.getString("username")
							, rs.getString("password"), type, rs.getInt("userid"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		return user;
	}

}