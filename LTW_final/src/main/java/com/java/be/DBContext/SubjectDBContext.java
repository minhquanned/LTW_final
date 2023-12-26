package com.java.be.DBContext;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.be.bean.Subject;

public class SubjectDBContext {
	
	Connection c;

	// Test connection
	public SubjectDBContext() {
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
		SubjectDBContext bConnect = new SubjectDBContext();
		Subject bSubject = new Subject("CSDL", "Database", "5");
		bConnect.updateSubject(bSubject);
	}

	// Take all Subject
	public List<Subject> getAllSubjects() throws ClassNotFoundException {
		List<Subject> subjects = new ArrayList<>();

		try {
//			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [SUBJECT]");

			while (rs.next()) {
				String subjectID = rs.getString("subjectID");
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
	
	public Subject getSubjectbyID(String id) throws ClassNotFoundException {
		try {
			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [SUBJECT] WHERE subjectID = '" + id + "'");

			while (rs.next()) {
				String subjectID = rs.getString("subjectID");
				String subjectName = rs.getString("subjectName");
				String noC = rs.getString("noC");

				return new Subject(subjectID, subjectName, noC);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	// Add Subject
	public void addSubject(String subjectID, String subjectName, String noC) throws ClassNotFoundException {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("INSERT INTO [SUBJECT] (subjectID, subjectName, noC) values (?, ?, ?)");
			pstm.setString(1, subjectID);
			pstm.setString(2, subjectName);
			pstm.setString(3, noC);

			pstm.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Update Subject
	public void updateSubject(Subject subject) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("UPDATE [SUBJECT] SET subjectName = ?, noC = ? WHERE subjectID = ?");
			pstm.setString(1, subject.getSubjectName());
			pstm.setString(2, subject.getNoC());
			pstm.setString(3, subject.getSubjectID());
			
			pstm.executeUpdate();
			System.out.println(subject.toString());
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Delete Subject
	public void deleteSubject(String subjectID) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("DELETE FROM [SUBJECT] WHERE subjectID = ?");
			pstm.setString(1, subjectID);
			
			pstm.executeUpdate();
			System.out.println("delete success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
