package com.ashu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ashu.pojo.User;

public class UserDAOVersion2 implements IUserDAO{

	@Override
	public String getUserType(String userName, String password)  {
	Connection connection=ConnectionFactory.getConnection();
	try {
	PreparedStatement statement=connection.prepareStatement("Select * from user2 where userName=? and password=?");
			 
				statement.setString(1, userName);
				statement.setString(2, password);
				ResultSet set=statement.executeQuery();
				while(set.next()){
					if(set.getString("userName").equals(userName) &&
							set.getString("password").equals(password)){
						return set.getString("userType");
					}
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	
		return "invalid";
	}

	@Override
	public void addUser(User user) {
	
		
	}

	@Override
	public void chnagePasword(String userName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(String userName) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws InvalidUserException {
		System.out.println(new UserDAOVersion2().getUserType("Vijay", "c"));
	}

}
