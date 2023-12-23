package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EditStudent
 */
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDBContext studentDBContext = new StudentDBContext();
		String studentID = request.getParameter("studentID");
		if (request.getParameter("studentID") != null && !request.getParameter("studentID").isEmpty()) {
			try {
				Student student = studentDBContext.getStudentbyID(request.getParameter("studentID"));
				request.setAttribute("student", student);
				request.getRequestDispatcher("StudentEdit.jsp").forward(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			String studentID = request.getParameter("studentID");
			String className = request.getParameter("className");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String birthday = request.getParameter("birthday");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");

			StudentDBContext studentDBContext = new StudentDBContext();
			Student student = new Student(studentID, className, firstName, lastName, birthday, gender, email,
					phoneNumber);
			studentDBContext.updateStudent(student);
//	            out.print(student.toString());
		} catch (Exception e) {
			out.print(e.getMessage());
		}
		response.sendRedirect("StudentServlet");
	}

}
