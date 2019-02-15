package com.ashu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.util.Password;

/**
 * Servlet implementation class AddServlets
 */
//@WebServlet("/AddServlets")
public class AddServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlets() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String username = request.getParameter("username");
	        String pass = request.getParameter("password");
	        String email = request.getParameter("email");
	        int mobile=Integer.parseInt(request.getParameter("mobile"));
	        String gender=request.getParameter("gender");
	        
	        
	            out.println(username);
	           
	            out.println(pass);
	           
	            out.println(email);
	          
	            out.println(mobile);
	            out.println(gender);


}
	}