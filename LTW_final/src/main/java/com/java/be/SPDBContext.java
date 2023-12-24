package com.java.be;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SPDBContext {
	
	Connection c;

	// Test connection
	public SPDBContext() {
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
		SPDBContext bConnect = new SPDBContext();
//		SP bSP = new SP("CSDL", "Database", "5");
//		bConnect.updateSP(bSP);
	}

	// Take all SP
	public List<SP> getAllSPs() throws ClassNotFoundException {
		List<SP> sps = new ArrayList<>();

		try {
//			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [SPECIALIZED_PROJECT]");

			while (rs.next()) {
				String spID = rs.getString("spID");
				String spName = rs.getString("spName");
				int schoolYear = rs.getInt("schoolYear");
				int spPart = rs.getInt("spPart");
				String subjectID = rs.getString("subjectID");

				SP sp = new SP(spID, spName, schoolYear, spPart, subjectID);

				sps.add(sp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sps;
	}
	
	public SP getSPbyID(String id) throws ClassNotFoundException {
		try {
			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [SPECIALIZED_PROJECT] WHERE spID = '" + id + "'");

			while (rs.next()) {
				String spID = rs.getString("spID");
				String spName = rs.getString("spName");
				int schoolYear = rs.getInt("schoolYear");
				int spPart = rs.getInt("spPart");
				String subjectID = rs.getString("subjectID");

				return new SP(spID, spName, schoolYear, spPart, subjectID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	// Add SP
	public void addSP(String spID, String spName, int schoolYear, int spPart, String subjectID) throws ClassNotFoundException {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("INSERT INTO [SPECIALIZED_PROJECT] (spID, spName, schoolYear, spPart, subjectID) values (?, ?, ?, ?, ?)");
			pstm.setString(1, spID);
			pstm.setString(2, spName);
			pstm.setInt(3, schoolYear);
			pstm.setInt(4, spPart);
			pstm.setString(5, subjectID);

			pstm.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Update SP
	public void updateSP(SP sp) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("UPDATE [SPECIALIZED_PROJECT] SET spName = ?, schoolYear = ?, spPart = ?, subjectID = ? WHERE spID = ?");
			pstm.setString(1, sp.getSpName());
			pstm.setInt(2, sp.getSchoolYear());
			pstm.setInt(3, sp.getSpPart());
			pstm.setString(4, sp.getSubjectID());
			pstm.setString(5, sp.getSpID());
			System.out.println(sp.toString());
			
			pstm.executeUpdate();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Delete SP
	public void deleteSP(String spID) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("DELETE FROM [SPECIALIZED_PROJECT] WHERE spID = ?");
			pstm.setString(1, spID);
			
			pstm.executeUpdate();
			System.out.println("delete success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
