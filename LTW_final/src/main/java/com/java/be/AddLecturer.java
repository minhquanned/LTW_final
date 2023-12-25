package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class AddLecturer
 */
public class AddLecturer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddLecturer() {
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
			String lecturerID = request.getParameter("lecturerID");
			String position = request.getParameter("position");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String birthday = request.getParameter("birthday");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");
			LecturerDBContext lecturerDBContext = new LecturerDBContext();
			try {
				lecturerDBContext.addLecturer(lecturerID, position, firstName, lastName, birthday, gender, email,
						phoneNumber);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("LecturerServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
