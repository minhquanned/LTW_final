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
 * Servlet implementation class AddSP
 */
public class AddSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSP() {
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
			SubjectDBContext subjectDBConetxt = new SubjectDBContext();
			try {
				List<Subject> list = subjectDBConetxt.getAllSubjects();

				request.setAttribute("ListSubjects", list);
				request.getRequestDispatcher("SPRegistration.jsp").forward(request, response);
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
		String spID = request.getParameter("spID");
		String spName = request.getParameter("spName");
		int schoolYear = Integer.parseInt(request.getParameter("schoolYear"));
		int spPart = Integer.parseInt(request.getParameter("spPart"));
		String subjectID = request.getParameter("subjectID");
		SPDBContext spDBContext = new SPDBContext();
		try {
			spDBContext.addSP(spID, spName, schoolYear, spPart, subjectID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("SPServlet");
	}

}
