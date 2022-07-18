package com.revature.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher requestDispatcher;
		
		
		String uName=request.getParameter("username");
		String uPass=request.getParameter("password");
		
		out.print("<h3>Welcome, "+uName.toUpperCase()+"</h3>");
		out.print("<h3>Password Accepted "+"</h3><br/>");
		out.print("<a href=\"Homepage.html\" target=\"_blank\">Click to Open Homepage</a> <hr/>");
	
		 if (Login.getUserRole().equalsIgnoreCase("admin")) {
				requestDispatcher = request.getRequestDispatcher("admin");
				requestDispatcher.forward(request, response);
	}
	
}

	private static String getUserRole() {
		// TODO Auto-generated method stub
		return null;
	}
}