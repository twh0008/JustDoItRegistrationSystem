package admin.removeuser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import support.DBConnect;

public class RemoveUserModel {

public RemoveUserModel() {
		

	}
	public boolean RemoveUser(int crn) {
		DBConnect db = new DBConnect();
		Connection con = db.connect();
		String deleteSQL = "DELETE FROM `teamredt_justdoit`.`users` WHERE `users`.`userid` = ?";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(deleteSQL);
			pstmt.setInt(1, crn);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
}
}