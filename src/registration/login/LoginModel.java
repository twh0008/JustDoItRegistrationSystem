package registration.login;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import support.DBConnect;


public class LoginModel {

	private String username;
	private char[] password;

	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(char[] password2){
		this.password = password2;
	}
	public int verifyAccount(){
		int type = -1;
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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.disconnect();
		return type;
	}

}