package admin.updateregistrationstatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import support.DBConnect;

public class UpdateRegistrationStatusModel {

	
	public UpdateRegistrationStatusModel() {
		

	}
	public boolean UpdateRegistration(int id, int status) {
		DBConnect db = new DBConnect();
		Connection con = db.connect();
		String deleteSQL = "UPDATE `teamredt_justdoit`.`users` SET `regstatus` = ? WHERE `users`.`userid` = ?";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(deleteSQL);
			pstmt.setInt(1, status);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
}
}