package com.ashu.dao;

import java.util.ArrayList;

import com.ashu.pojo.InvalidUserException;
import com.ashu.pojo.User;

public class UserDAO {
	
	ArrayList<User> userlist;
	
	public UserDAO(){
		userlist=new ArrayList<>();
		userlist.add(new User("Ashu","java","Admin"));
		userlist.add(new User("Pappu","java","User"));
	}
	public String getUserType(String userName, String password){
		for(User user:userlist) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("User Name and Password doesnt exists...");
	}

	}
