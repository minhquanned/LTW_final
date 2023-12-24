package com.java.be;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
