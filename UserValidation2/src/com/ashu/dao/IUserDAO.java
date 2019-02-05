package com.ashu.dao;

import com.ashu.pojo.User;

public interface IUserDAO {
	
	public String getUserType(String userName,String password) throws InvalidUserException;
		public void addUser(User user);
		public void chnagePasword(String userName,String oldPassword,String newPassword);
		public void removeUser(String userName);
		
	
	

}
