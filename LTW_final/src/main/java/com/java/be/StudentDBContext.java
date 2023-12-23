package com.java.be;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDBContext {
	Connection c;

	// Test connection
	public StudentDBContext() {
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
		StudentDBContext bConnect = new StudentDBContext();
//		Student bStudent = new Student("CSDL", "dtb001", "3");
//		bConnect.updateStudent(bStudent);
	}

	// Take all Student
	public List<Student> getAllStudents() throws ClassNotFoundException {
		List<Student> students = new ArrayList<>();

		try {
//			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [STUDENT]");

			while (rs.next()) {
				String studentID = rs.getString("studentID");
				String className = rs.getString("className");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");

				Student student = new Student(studentID, className, firstName, lastName, birthday, gender, email, phoneNumber);

				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return students;
	}
	
	public Student getStudentbyID(String id) throws ClassNotFoundException {
		try {
			c = dbConnect.initializeDatabase();
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM [STUDENT] WHERE studentID = '" + id + "'");

			while (rs.next()) {
				String studentID = rs.getString("studentID");
				String className = rs.getString("className");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");

				return new Student(studentID, className, firstName, lastName, birthday, gender, email, phoneNumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	// Add Student
	public void addStudent(String studentID, String className, String firstName, String lastName, String birthday, String gender, String email, String phoneNumber) throws ClassNotFoundException {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("INSERT INTO [STUDENT] (studentID, className, firstName, lastName, birthday, gender, email, phoneNumber) values (?, ?, ?, ?, ?, ?, ?, ?)");
			pstm.setString(1, studentID);
			pstm.setString(2, className);
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

	// Update Student
	public void updateStudent(Student student) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c
					.prepareStatement("UPDATE [STUDENT] SET className = ?, firstName = ?, lastName = ?, birthday = ?, gender = ?, email = ?, phoneNumber = ? WHERE studentID = ?");
			pstm.setString(1, student.getClassName());
			pstm.setString(2, student.getFirstName());
			pstm.setString(3, student.getLastName());
			pstm.setString(4, student.getBirthday());
			pstm.setString(5, student.getGender());
			pstm.setString(6, student.getEmail());
			pstm.setString(7, student.getPhoneNumber());
			pstm.setString(8, student.getStudentID());
			
			pstm.executeUpdate();
			System.out.println("update success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Delete Student
	public void deleteStudent(String studentID) {
		try {
//			c = dbConnect.initializeDatabase();
			PreparedStatement pstm = c.prepareStatement("DELETE FROM [STUDENT] WHERE studentID = ?");
			pstm.setString(1, studentID);
			
			pstm.executeUpdate();
			System.out.println("delete success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
