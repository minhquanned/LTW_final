package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubjectDBContext {
	
//	private Connection connection;
	
	public SubjectDBContext() {
		try {
			Connection c = dbConnect.initializeDatabase();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		SubjectDBContext bConnect = new SubjectDBContext();
		List<Subject> list = bConnect.getAllSubjects();
	}
	
	public List<Subject> getAllSubjects() throws ClassNotFoundException {
		List<Subject> subjects = new ArrayList<>();
		
		try {
			Connection c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [SUBJECT]");
			
			while (rs.next()) {
				String subjectID = rs.getString("subjectID");
				System.out.println(subjectID);
				String subjectName = rs.getString("subjectName");
				String noC = rs.getString("noC");
				
				Subject subject = new Subject(subjectID, subjectName, noC);
				
				subjects.add(subject);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return subjects;
	}
	
	public void addSubject(String subjectID, String subjectName, String noC) throws ClassNotFoundException {
		try {
			Connection c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("INSERT INTO [SUBJECT] (subjectID, subjectName, noC) values (?, ?, ?)");
			pstm.setString(1, subjectID);
			pstm.setString(2, subjectName);
			pstm.setString(3, noC);
			
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
