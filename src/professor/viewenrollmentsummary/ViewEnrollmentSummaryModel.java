package professor.viewenrollmentsummary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import support.*;

public class ViewEnrollmentSummaryModel {

	private Professor prof;	
	private int crn;
	
	public ViewEnrollmentSummaryModel(Professor prof){
		this.prof = prof;
	}
	
	public void setCrn(int crn) {
		this.crn = crn;
		
	}
	public String[][] prepareTable(){
		ArrayList<Student> stds = getStudents();
		String[][] tableInfo = new String[stds.size()][3];
		System.out.println("Before loopinfo");
		for(int i = 0; i < stds.size(); i++){
			System.out.println(tableInfo[i][0]);
			tableInfo[i][0] = stds.get(i).getFirstName();
			System.out.println(tableInfo[i][1]);
			tableInfo[i][1] = stds.get(i).getLastName();
			tableInfo[i][2] = "" + stds.get(i).getUserId();

		}
		return tableInfo;
	}
	
	public ArrayList<Student> getStudents(){
		
		DBConnect db = new DBConnect();
		db.connect();
		ResultSet rs;
		String sql = "SELECT studentsenrolled FROM courses WHERE courseid='"
					+ crn +"'";
		String studentsRaw = "";
		
		db.setSqlquery(sql);
		db.dbExecute();
		rs = db.getRs();
		
		try {
			if(rs.next()){
				studentsRaw = rs.getString("studentsenrolled");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] students = studentsRaw.split("\\s+");
		
		ArrayList<Student> studentsls = new ArrayList<Student>();
		for(int i = 0; i < students.length; i++){
			sql = "SELECT firstname, lastname FROM users WHERE userid='"
					+ Integer.parseInt(students[i]) + "'";
			db.setSqlquery(sql);
			db.dbExecute();
			rs = db.getRs();
			
			try {
				if(rs.next()){
					
					studentsls.add(new Student(rs.getString("firstname"), rs.getString("lastname"), 
							"", "", 0, Integer.parseInt(students[i]),
							false, .0, null));
				}
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		db.disconnect();
		return studentsls;
	}

}
