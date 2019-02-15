package com.ashu.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ashu.sql.ConnectionFactory;
import com.ashu.servlet.*;

public class UserDao {

	public static void save(User u){  
	   // int status=0;  
	    try{  
	    	
	        Connection con=ConnectionFactory.getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into UserList(name,password,confirmpassword,email,sex,country,securityquestion,securityanswer) values(?,?,?,?,?,?,?,?)");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getPassword());    
	        ps.setString(3,u.getConfirmpassword());
	        ps.setString(4,u.getEmail());  
	        ps.setString(5,u.getSex());  
	        ps.setString(6,u.getCountry()); 
	        ps.setString(7,u.getSecurityquestion()); 
	        ps.setString(8,u.getSecurityanswer()); 
	       
	        ResultSet rs=ps.executeQuery(); 
	        while(rs.next()){
	        String formname=rs.getString(1);
	        System.out.println(formname);
	        }
	        
	    }catch(Exception e){System.out.println(e);}  
	    //return status;  
	}  

}
