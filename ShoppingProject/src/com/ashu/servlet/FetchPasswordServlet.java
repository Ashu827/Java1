package com.ashu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashu.sql.ConnectionFactory;
import com.ashu.util.User;

/**
 * Servlet implementation class FetchPasswordServlet
 */
@WebServlet("/fetchpassword")
public class FetchPasswordServlet extends HttpServlet {
	
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			PrintWriter out=response.getWriter();
			String  email = null, securityquestion = null,securityanswer = null;
			//User u=new User(userName,securityquestion,securityanswer);
		
			email = request.getParameter("email"); 
			securityquestion=request.getParameter("securityquestion");
			securityanswer=request.getParameter("securityanswer");
			
	        Connection con=ConnectionFactory.getConnection();  
	       
	        PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(  
						"select securityquestion, securityanswer, password from userlist where email=? ");
				ps.setString(1,email);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
				String question=rs.getString(1);
				String answer=rs.getString(2);
				String password=rs.getString(3);
				
				if(securityquestion.equals(question) && securityanswer.equals(answer)){
					
					out.println(password);
					
				}
				else {out.println("The security question and security answer does not match!! ");
			}
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}  	
		}	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
		}
		
		
	}
