package com.java.be;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/subjectRegister","/subjectRegister/*"})
public class subjectRegister extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// Get data from SubjectRegistration.jsp
		String subjectID = req.getParameter("subjectID");
		String subjectName = req.getParameter("subjectName");
		String noC = req.getParameter("noC");
		
		Subject subject = new Subject(subjectID, subjectName, noC);
		
		try {
			Connection c = dbConnect.initializeDatabase();
			
			// insert new subject
			String sql = "insert into [SUBJECT] (subjectID, subjectName, noC) values (?, ?, ?)";
			PreparedStatement pstm = c.prepareStatement(sql);
			
			pstm.setString(1, subjectID);
			pstm.setString(2, subjectName);
			pstm.setString(3, noC);
			
			pstm.executeUpdate();
			System.out.println("success!");
			
			pstm.close();
            c.close();
            
            String url = "/Subjects.jsp";
            getServletContext().getRequestDispatcher(url).forward(req, res);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
