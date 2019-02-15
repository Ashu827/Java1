package com.ashu.spring;

public class UserDAO {
	
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(User u){  
	    String query="insert into spring values(u.getuserName()+u.getpassword())";
		return 0;
	    
	}  

}
