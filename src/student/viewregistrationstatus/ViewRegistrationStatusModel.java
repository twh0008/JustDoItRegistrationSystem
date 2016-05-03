package student.viewregistrationstatus;

import java.sql.ResultSet;
import java.sql.SQLException;

import support.DBConnect;
import support.Student;

public class ViewRegistrationStatusModel {

	private Student student;
	public ViewRegistrationStatusModel(Student user) {
		student = user;
	}
	public boolean getStatus() {
		DBConnect db = new DBConnect();
		db.connect();
		String sql = "SELECT regstatus FROM users WHERE username='" 
				+ student.getUsername() + "' and password='" + student.getPassword() + "'";
		
		db.setSqlquery(sql);
		db.dbExecute();
		ResultSet rs = db.getRs();
		try {
			if(rs.next()){
				student.setRegStatus(rs.getBoolean("regstatus"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.disconnect();
		return student.isRegStatus();
	}
	
	

}
