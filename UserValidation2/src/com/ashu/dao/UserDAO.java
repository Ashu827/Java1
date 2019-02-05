package com.ashu.dao;

import java.util.ArrayList;

import com.ashu.pojo.User;

public class UserDAO implements IUserDAO {
	
	ArrayList<User> list=new ArrayList<User>();
	
	public UserDAO(){
		list=new ArrayList<User>();
		list.add(new User("Ashu", "Java","Admin"));
		list.add(new User("pappu", "sql", "User"));
		list.add(new User("sidd", "c", "Invalid"));
	}
	
	
	public String getUserType(String userName, String password) throws InvalidUserException
	{
		for(User user:list)
		{
			if(user.getUserName().equals(userName)&& user.getPassowrd().equals(password))
			{
				return user.getUserType();
			}
		}	
		throw new InvalidUserException("User Name and Password doesnt exists...");
		
	}	
		
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
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
	

}
