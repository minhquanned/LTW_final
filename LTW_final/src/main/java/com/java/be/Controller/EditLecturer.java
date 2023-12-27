package com.java.be.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.java.be.DBContext.LecturerDBContext;
import com.java.be.bean.Lecturer;
import com.java.be.bean.User;

/**
 * Servlet implementation class EditLecturer
 */
public class EditLecturer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditLecturer() {
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
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userSession");
		if (user == null) {
			response.sendRedirect("LoginPage.jsp");
		} else {
			LecturerDBContext lecturerDBContext = new LecturerDBContext();
			String lecturerID = request.getParameter("lecturerID");
			if (request.getParameter("lecturerID") != null && !request.getParameter("lecturerID").isEmpty()) {
				try {
					Lecturer lecturer = lecturerDBContext.getLecturerbyID(request.getParameter("lecturerID"));
					request.setAttribute("lecturer", lecturer);
					request.getRequestDispatcher("LecturerEdit.jsp").forward(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// Return LecturerServlet if there is no id transfer to
//		response.sendRedirect("LecturerServlet");
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
			String lecturerID = request.getParameter("lecturerID");
			String position = request.getParameter("position");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String birthday = request.getParameter("birthday");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");

			LecturerDBContext lecturerDBContext = new LecturerDBContext();
			Lecturer lecturer = new Lecturer(lecturerID, position, firstName, lastName, birthday, gender, email,
					phoneNumber);
			lecturerDBContext.updateLecturer(lecturer);
//	            out.print(student.toString());
		} catch (Exception e) {
			out.print(e.getMessage());
		}
		response.sendRedirect("LecturerServlet");
	}

}