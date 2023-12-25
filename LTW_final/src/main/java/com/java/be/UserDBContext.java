package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDBContext {
	Connection c;

	// Test connection
	public UserDBContext() {
		try {
			c = dbConnect.initializeDatabase();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		UserDBContext userDBContext = new UserDBContext();
		User user = userDBContext.getUser("ned", "123");
		System.out.println(user);
	}
	
	public User getUser(String userName, String passWord) throws SQLException {
		PreparedStatement pstm = c.prepareStatement("SELECT * from [USER] where userName = ? AND password = ?");
		pstm.setString(1, userName);
		pstm.setString(2, passWord);
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			String userID = rs.getString("userID");
			String username = rs.getString("userName");
			String password = rs.getString("password");
			User user = new User(userID, username, password);
			return user;
		}
		
		return null;
	}
	
	public User getAccount(String userName, String password) throws SQLException {
		UserDBContext userDBContext = new UserDBContext();
		return userDBContext.getUser(userName, password);
	}
}
