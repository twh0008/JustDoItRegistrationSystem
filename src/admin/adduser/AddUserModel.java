package admin.adduser;

import java.sql.Connection;

import support.DBConnect;

public class AddUserModel {
	
	private String userFirst;
	private String userLast;
	private String userName;
	private String userPass;
	private String userType;


	
	public void setUserFirst(String userFirst){
		this.userFirst = userFirst;
	}
	
	public void setUserLast(String userLast){
		this.userLast = userLast;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setUserPass(String userPass){
		this.userPass = userPass;
	}
	
	public void setUserType(String userType){
		if (userType == "Admin") { this.userType = "0"; }
		if (userType == "Professor") { this.userType = "1"; }
		if (userType == "Student") { this.userType = "2"; }
	}
	
	public boolean createUser() {
		try {
		DBConnect db = new DBConnect();
		Connection conn = db.connect();
		
		String sql = " INSERT INTO `teamredt_justdoit`.`users`(firstname, lastname, username, password, usertype, schedule, grades)"
				+ " values (?,?,?,?,?,?,?)";
		
		java.sql.PreparedStatement preparedStmt = conn.prepareStatement(sql);
	      preparedStmt.setString (1, userFirst);
	      preparedStmt.setString (2, userLast);
	      preparedStmt.setString (3, userName);
	      preparedStmt.setString (4, userPass);
	      preparedStmt.setString (5, userType);
	      preparedStmt.setString (6, "");
	      preparedStmt.setString (7, "");
	      
	      preparedStmt.execute();
	      conn.close();
	      return true;
	      
		} catch (Exception e) {
			System.err.println("Exception!");
			return false;
		}
			
	}

}