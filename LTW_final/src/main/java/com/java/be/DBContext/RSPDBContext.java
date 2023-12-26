package com.java.be.DBContext;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.be.bean.RSP;

public class RSPDBContext {
	
	Connection c;

	// Test connection
	public RSPDBContext() {
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

	// Test
	public static void main(String[] args) throws ClassNotFoundException {
		RSPDBContext bConnect = new RSPDBContext();
		RSP rsp = new RSP("RSP001","SP001","STD001","MHT01");
		bConnect.updateRSP(rsp);
//		System.out.println();
		
//		SPDBContext cContext = new SPDBContext();
		
//		RSP test = bConnect.getRSPbyID("RSP001");
		
//		System.out.println(cContext.getSPbyID(test.getSpID()).getSpName());
	}

	// Take all SP
	public List<RSP> getAllRSPs() throws ClassNotFoundException {
		List<RSP> rsps = new ArrayList<>();

		try {
//			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [REGISTRATION_SP]");

			while (rs.next()) {
				String rspID = rs.getString("rspID");
				String spID = rs.getString("spID");
				String studentID = rs.getString("studentID");
				String lecturerID = rs.getString("lecturerID");

				RSP rsp = new RSP(rspID, spID, studentID, lecturerID);

				rsps.add(rsp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rsps;
	}
	
	public RSP getRSPbyID(String id) throws ClassNotFoundException {
		try {
			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [REGISTRATION_SP] WHERE rspID = '" + id + "'");

			while (rs.next()) {
				String rspID = rs.getString("rspID");
				String spID = rs.getString("spID");
				String studentID = rs.getString("studentID");
				String lecturerID = rs.getString("lecturerID");

				return new RSP(rspID, spID, studentID, lecturerID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	// Add SP
	public void addRSP(String rspID, String spID, String studentID, String lecturerID) throws ClassNotFoundException {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("INSERT INTO [REGISTRATION_SP] (rspID, spID, studentID, lecturerID) values (?, ?, ?, ?)");
			pstm.setString(1, rspID);
			pstm.setString(2, spID);
			pstm.setString(3, studentID);
			pstm.setString(4, lecturerID);

			pstm.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Update SP
	public void updateRSP(RSP rsp) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("UPDATE [REGISTRATION_SP] SET spID = ?, studentID = ?, lecturerID = ? WHERE rspID = ?");
			pstm.setString(1, rsp.getSpID());
			pstm.setString(2, rsp.getStudentID());
			pstm.setString(3, rsp.getLecturerID());
			pstm.setString(4, rsp.getRspID());
			System.out.println(rsp.toString());
			
			pstm.executeUpdate();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Delete SP
	public void deleteRSP(String rspID) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("DELETE FROM [REGISTRATION_SP] WHERE rspID = ?");
			pstm.setString(1, rspID);
			
			pstm.executeUpdate();
			System.out.println("delete success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
