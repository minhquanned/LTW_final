package com.java.be.viewServlet;

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
 * Servlet implementation class RSPServlet
 */
public class RSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RSPServlet() {
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
			SPDBContext spDBConetxt = new SPDBContext();
			StudentDBContext studentDBContext = new StudentDBContext();
			LecturerDBContext lecturerDBContext = new LecturerDBContext();
			try {
				List<RSP> rspList = rspDBContext.getAllRSPs();
				List<SP> spList = spDBConetxt.getAllSPs();
				List<Student> studentList = studentDBContext.getAllStudents();
				List<Lecturer> Lecturerist = lecturerDBContext.getAllLecturers();

				request.setAttribute("rspList", rspList);
				request.setAttribute("spList", spList);
				request.setAttribute("studentList", studentList);
				request.setAttribute("Lecturerist", Lecturerist);
				request.getRequestDispatcher("RSPs.jsp").forward(request, response);
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
		doGet(request, response);
	}

}