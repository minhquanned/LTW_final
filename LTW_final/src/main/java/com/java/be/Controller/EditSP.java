package com.java.be.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.java.be.DBContext.SPDBContext;
import com.java.be.DBContext.SubjectDBContext;
import com.java.be.bean.SP;
import com.java.be.bean.Subject;
import com.java.be.bean.User;

/**
 * Servlet implementation class EditSP
 */
public class EditSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditSP() {
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
			SubjectDBContext subjectDBConetxt = new SubjectDBContext();
//		String spID = request.getParameter("spID");
			if (request.getParameter("spID") != null && !request.getParameter("spID").isEmpty()) {
				try {
					List<Subject> list = subjectDBConetxt.getAllSubjects();
					SP sp = spDBContext.getSPbyID(request.getParameter("spID"));

					request.setAttribute("ListSubjects", list);
					request.setAttribute("sp", sp);
					request.getRequestDispatcher("SPEdit.jsp").forward(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			String spID = request.getParameter("spID");
			String spName = request.getParameter("spName");
			int schoolYear = Integer.parseInt(request.getParameter("schoolYear"));
			int spPart = Integer.parseInt(request.getParameter("spPart"));
			String subjectID = request.getParameter("subjectID");

			SPDBContext spDBContext = new SPDBContext();
			SP sp = new SP(spID, spName, schoolYear, spPart, subjectID);
			spDBContext.updateSP(sp);
//			out.print(sp.toString());
		} catch (Exception e) {
			out.print(e.getMessage());
		}
		response.sendRedirect("SPServlet");
	}

}
