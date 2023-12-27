package com.java.be.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.java.be.DBContext.LecturerDBContext;
import com.java.be.DBContext.RSPDBContext;
import com.java.be.DBContext.SPDBContext;
import com.java.be.DBContext.StudentDBContext;
import com.java.be.bean.Lecturer;
import com.java.be.bean.RSP;
import com.java.be.bean.SP;
import com.java.be.bean.Student;
import com.java.be.bean.User;

/**
 * Servlet implementation class EditRSP
 */
public class EditRSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditRSP() {
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
			RSPDBContext rspDBContext = new RSPDBContext();
			SPDBContext spDBContext = new SPDBContext();
			StudentDBContext studentDBContext = new StudentDBContext();
			LecturerDBContext lecturerDBContext = new LecturerDBContext();
//		String rspID = request.getParameter("rspID");
			if (request.getParameter("rspID") != null && !request.getParameter("rspID").isEmpty()) {
				try {
//				List<RSP> rspList = rspDBContext.getAllRSPs();
					List<SP> spList = spDBContext.getAllSPs();
					List<Student> studentList = studentDBContext.getAllStudents();
					List<Lecturer> lecturerList = lecturerDBContext.getAllLecturers();

					RSP rsp = rspDBContext.getRSPbyID(request.getParameter("rspID"));

//				request.setAttribute("ListRSPs", rspList);
					request.setAttribute("ListSPs", spList);
					request.setAttribute("ListStudents", studentList);
					request.setAttribute("ListLecturers", lecturerList);
					request.setAttribute("rsp", rsp);
					request.getRequestDispatcher("RSPEdit.jsp").forward(request, response);
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
		try {
			String rspID = request.getParameter("rspID");
			String spID = request.getParameter("spID");
			String sutdentID = request.getParameter("studentID");
			String lecturerID = request.getParameter("lecturerID");

			RSPDBContext rspDBContext = new RSPDBContext();
			RSP rsp = new RSP(rspID, spID, sutdentID, lecturerID);
			rspDBContext.updateRSP(rsp);
			System.out.println(rsp.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		response.sendRedirect("RSPServlet");
	}

}