package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LecturerDBContext {
	Connection c;

	// Test connection
	public LecturerDBContext() {
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
		LecturerDBContext bConnect = new LecturerDBContext();
//		Lecturer bLecturer = new Lecturer("CSDL", "dtb001", "3");
//		bConnect.updateLecturer(bLecturer);
	}

	// Take all Lecturer
	public List<Lecturer> getAllLecturers() throws ClassNotFoundException {
		List<Lecturer> lecturers = new ArrayList<>();

		try {
//			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [LECTURER]");

			while (rs.next()) {
				String lecturerID = rs.getString("lecturerID");
				String position = rs.getString("position");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");

				Lecturer lecturer = new Lecturer(lecturerID, position, firstName, lastName, birthday, gender, email, phoneNumber);

				lecturers.add(lecturer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lecturers;
	}
	
	public Lecturer getLecturerbyID(String id) throws ClassNotFoundException {
		try {
			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [LECTURER] WHERE lecturerID = '" + id + "'");

			while (rs.next()) {
				String lecturerID = rs.getString("lecturerID");
				String position = rs.getString("position");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");

				return new Lecturer(lecturerID, position, firstName, lastName, birthday, gender, email, phoneNumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	// Add Lecturer
	public void addLecturer(String lecturerID, String position, String firstName, String lastName, String birthday, String gender, String email, String phoneNumber) throws ClassNotFoundException {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("INSERT INTO [LECTURER] (lecturerID, position, firstName, lastName, birthday, gender, email, phoneNumber) values (?, ?, ?, ?, ?, ?, ?, ?)");
			pstm.setString(1, lecturerID);
			pstm.setString(2, position);
			pstm.setString(3, firstName);
			pstm.setString(4, lastName);
			pstm.setString(5, birthday);
			pstm.setString(6, gender);
			pstm.setString(7, email);
			pstm.setString(8, phoneNumber);

			pstm.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Update Lecturer
	public void updateLecturer(Lecturer lecturer) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("UPDATE [SUBJECT] SET firstName = ?, lastName = ?, birthday = ?, gender = ?, email = ?, phoneNumber = ? WHERE lecturerID = ?");
			pstm.setString(1, lecturer.getPosition());
			pstm.setString(2, lecturer.getFirstName());
			pstm.setString(3, lecturer.getLastName());
			pstm.setString(4, lecturer.getBirthday());
			pstm.setString(5, lecturer.getGender());
			pstm.setString(6, lecturer.getEmail());
			pstm.setString(7, lecturer.getPhoneNumber());
			pstm.setString(8, lecturer.getLecturerID());
			
			pstm.executeUpdate();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Delete Lecturer
	public void deleteLecturer(String lecturerID) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("DELETE FROM [LECTURER] WHERE lecturerID = ?");
			pstm.setString(1, lecturerID);
			
			pstm.executeUpdate();
			System.out.println("delete success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
