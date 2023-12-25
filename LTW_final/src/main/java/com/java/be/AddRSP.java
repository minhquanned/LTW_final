package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class AddRSP
 */
public class AddRSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRSP() {
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
			SPDBContext spDBContext = new SPDBContext();
			StudentDBContext studentDBContext = new StudentDBContext();
			LecturerDBContext lecturerDBContext = new LecturerDBContext();

			try {
				List<SP> spList = spDBContext.getAllSPs();
				List<Student> studentList = studentDBContext.getAllStudents();
				List<Lecturer> lecturerList = lecturerDBContext.getAllLecturers();

				request.setAttribute("ListSPs", spList);
				request.setAttribute("ListStudents", studentList);
				request.setAttribute("ListLecturers", lecturerList);
				request.getRequestDispatcher("RSPRegistration.jsp").forward(request, response);
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
		String rspID = request.getParameter("rspID");
		String spID = request.getParameter("spID");
		String studentID = request.getParameter("studentID");
		String lecturerID = request.getParameter("lecturerID");
		RSPDBContext rspDBContext = new RSPDBContext();
		try {
			rspDBContext.addRSP(rspID, spID, studentID, lecturerID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("RSPServlet");
	}

}
