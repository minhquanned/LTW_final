package com.java.be.viewServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.java.be.DBContext.UserDBContext;
import com.java.be.bean.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName + " " + password);
		UserDBContext userDBContext = new UserDBContext();
//		String errorMessage = "";
		
		try {
			User user = userDBContext.getUser(userName, password);
			System.out.println(userName + " " + password);
			System.out.println("from LoginServlet " + user);
			if(user == null) {
				request.setAttribute("errorMessage", "*Your username/password is invalid!");
				request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("userSession", user);
				session.setAttribute("loginSession", true);
				response.sendRedirect("HomePage.jsp");
			}
		} catch (SQLException e) {
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
