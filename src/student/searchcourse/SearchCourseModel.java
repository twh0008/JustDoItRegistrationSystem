package student.searchcourse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import support.Course;
import support.DBConnect;
import support.Student;
import support.Time;

public class SearchCourseModel {
	
	public SearchCourseModel(){
	}
	
	public String[][] processCourses(String term) {
		
		ArrayList<Course> crs = getCourses(term);
		String[][] tableInfo = new String[crs.size()][7];
		
		for(int i = 0; i < crs.size(); i++){
			tableInfo[i][0] = "" + crs.get(i).getCourseId();
			System.out.println(tableInfo[i][0]);
			tableInfo[i][1] = crs.get(i).getCourseName();
			System.out.println(tableInfo[i][1]);
			tableInfo[i][2] = "" + crs.get(i).getCourseSize();
			tableInfo[i][3] = "" + crs.get(i).getCourseCapacity();
			tableInfo[i][4] = "" + crs.get(i).getCourseCredits();
			tableInfo[i][5] = crs.get(i).getCourseTime().getWeekDay();
			tableInfo[i][6] = crs.get(i).getCourseTime().getTime();
		}
		
		
		return tableInfo;
	}
	
	private ArrayList<Course> getCourses(String term){
		
		DBConnect db = new DBConnect();
		ArrayList<Course> courses = new ArrayList<Course>();
		db.connect();
		String sql = "SELECT * FROM courses WHERE term='" 
				+ term + "'";
		db.setSqlquery(sql);
		db.dbExecute();
		ResultSet rs = db.getRs();
		try {
			while(rs.next()){
				Time time = new Time(rs.getString("coursedate"), rs.getString("coursetime"));
				Course crsToAdd = new Course(rs.getString("coursename"), rs.getInt("courseid"), rs.getInt("coursesize"), rs.getInt("coursecap")
						, rs.getInt("coursecredits"), null, time, null);
				courses.add(crsToAdd);
				System.out.println("Course:ID" + crsToAdd.getCourseId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.disconnect();
		return courses;
	}

}
