package admin.removecourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import support.DBConnect;

public class RemoveCourseModel {

	public RemoveCourseModel() {
		

	}
	public boolean RemoveCourse(int crn) {
		DBConnect db = new DBConnect();
		Connection con = db.connect();
		String deleteSQL = "DELETE FROM `teamredt_justdoit`.`courses` WHERE `courses`.`courseid` = ?";
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