package com.ashu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.ashu.dao.IUserDAO;
import com.ashu.dao.InvalidUserException;
import com.ashu.dao.UserDAO;
import com.ashu.util.DAOUtility;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName;
		String password;

		PrintWriter out = response.getWriter();
		userName = request.getParameter("username");
		password = request.getParameter("pasword");
		// out.print("Welcome user "+userName);
		// out.print(password);

		RequestDispatcher requestDispatcher = null;
		// String userType=getUserType(userName, password);
		String userType = "Invalid";
		try {
			userType = getUserType(userName, password);
		} catch (InvalidUserException e) {
			out.print("<h1> Invalid user</h1>");
		}
		if (userType.equals("Admin")) {
			// out.print("Welcome Admin "+userName );
			requestDispatcher = request.getRequestDispatcher("/admin");

		} else if (userType.equals("User")) {
			requestDispatcher = request.getRequestDispatcher("/user");
			//out.print("<h1>Welcome User " + userName + "</h1>");
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			// out.print("<h1>invalid user</h1>");
		}
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private String getUserType(String userName, String password)
			throws InvalidUserException {
		//UserDAO dao = new UserDAO();
		// IUserDAO dao = new UserDAO();
		 IUserDAO dao = DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);
	}

}
