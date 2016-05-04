package registration.viewschedule;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import support.Course;
import support.DBConnect;
import support.Student;
import support.Time;

public class ViewScheduleModel {

	private Student student;
	
	public ViewScheduleModel(Student student){
		this.student = student;
	}
	
	public String[][] processSchedule(String term) {
		ArrayList<Course> sch = dbRetrieveCourses(term);
		String[][] tableInfo = new String[sch.size()][4];
		System.out.println("Before loopinfo");
		for(int i = 0; i < sch.size(); i++){
			System.out.println(tableInfo[i][0]);
			tableInfo[i][0] = sch.get(i).getCourseName();
			System.out.println(tableInfo[i][1]);
			tableInfo[i][1] = "" + sch.get(i).getCourseCredits();
			tableInfo[i][2] = sch.get(i).getCourseTime().getWeekDay();
			tableInfo[i][3] = sch.get(i).getCourseTime().getTime();
		}
		return tableInfo;
	}

	private ArrayList<Course> dbRetrieveCourses(String term) {
		
		int i = 0;
		ResultSet rs;
		String coursename = "-1";
		String semes = "-1";
		String sql = "";
		ArrayList<String> crs = student.getSchedule().getCourses();
		ArrayList<Course> termSchedule = new ArrayList<Course>();
		DBConnect db = new DBConnect();
		db.connect();
		
		while(i < crs.size()){
			sql = "SELECT coursename, coursecredits, coursedate, coursetime"
					+ " FROM courses WHERE coursename='" + crs.get(i) 
					+ "' AND term='" + term +"'";
			System.out.println("First course is:" + crs.get(i));
			db.setSqlquery(sql);
			db.dbExecute();
			rs = db.getRs();
			try {
				if(rs.next()){
					
					Time time = new Time(rs.getString("coursedate")
										,rs.getString("coursetime"));
					termSchedule.add(new Course(rs.getString("coursename"), 0, 0, 0,rs.getInt("coursecredits"),
							null, time, null));

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		db.disconnect();
		return termSchedule;
	}

}
