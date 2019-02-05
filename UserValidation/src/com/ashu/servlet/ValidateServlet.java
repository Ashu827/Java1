package com.ashu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashu.dao.UserDAO;
import com.ashu.pojo.InvalidUserException;


/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName,password;
		PrintWriter out=response.getWriter();
		
		userName=request.getParameter("username");
		password=request.getParameter("password");
		String userType="invalid";
		try {
			userType = getUserType(userName, password);
		} catch (InvalidUserException e) {
			out.print("<h1>Invalid User</h1>");
		}

		RequestDispatcher requestDispatcher=null;
		
		if(userType.equals("Admin")){
			requestDispatcher=request.getRequestDispatcher("/AdminServlet");
			
		}
		else if(userType.equals("User")){
			out.print("<h1>Welcome User " +userName+"</h1>");
		}
		else{
			out.print("<h1>Invalid User</h1>");
		}
		requestDispatcher.forward(request, response);
		
}

	
	private String getUserType(String userName, String password) {
		UserDAO dao=new UserDAO();
		return dao.getUserType(userName, password);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
