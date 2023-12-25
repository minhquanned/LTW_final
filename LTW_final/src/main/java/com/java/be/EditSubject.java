package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EditSubject
 */
public class EditSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditSubject() {
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
			SubjectDBContext subjectDBContext = new SubjectDBContext();
			if (request.getParameter("subjectID") != null && !request.getParameter("subjectID").isEmpty()) {
				try {
					Subject subject = subjectDBContext.getSubjectbyID(request.getParameter("subjectID"));
					request.setAttribute("subject", subject);
					request.getRequestDispatcher("SubjectEdit.jsp").forward(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// Return SubjectServlet if there is no id transfer to
//		response.sendRedirect("SubjectServlet");
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
			String subjectID = request.getParameter("subjectID");
			String subjectName = request.getParameter("subjectName");
			String noC = request.getParameter("noC");

			SubjectDBContext subjectDBContext = new SubjectDBContext();
			Subject subject = new Subject(subjectID, subjectName, noC);
			subjectDBContext.updateSubject(subject);
			out.print(subject.toString());
		} catch (Exception e) {
			out.print(e.getMessage());
		}
		response.sendRedirect("SubjectServlet");
	}

}
