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
import com.ashu.util.UserDao;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName, password, confirmpassword, email, sex, country, securityquestion, securityanswer;
	

		userName = request.getParameter("username");
		password = request.getParameter("password");
		confirmpassword = request.getParameter("confirmpassword");
		email = request.getParameter("email");
		sex = request.getParameter("sex");
		country = request.getParameter("country");
		securityquestion = request.getParameter("securityquestion");
		securityanswer = request.getParameter("securityanswer");
		

		
      /*  ps.setString(3,u.getConfirmpassword());
        ps.setString(4,u.getEmail());  
        ps.setString(5,u.getSex());  
        ps.setString(6,u.getCountry()); 
        ps.setString(7,u.getSecurityquestion()); 
        ps.setString(8,u.getSecurityanswer()); */
       
		
		
		
		System.out.println(userName);

		// Password verification
		if (password.equals(confirmpassword)) {
			/*UserDao.save(new User(userName, password, confirmpassword, email,
					sex, country, securityquestion, securityanswer));*/
			

	        Connection con=ConnectionFactory.getConnection();  
	        PreparedStatement ps;
			try {
				ps = con.prepareStatement(  
	"insert into UserList(name,password,confirmpassword,email,sex,country,securityquestion,securityanswer) values(?,?,?,?,?,?,?,?)");
				
				ps.setString(1,userName);  
		        ps.setString(2,password);    
		        ResultSet rs=ps.executeQuery(); 
		        String formname=rs.getString(1);
				System.out.println(formname);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		} else {
			out.println("The password and confirm password does not match!! ");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	

}