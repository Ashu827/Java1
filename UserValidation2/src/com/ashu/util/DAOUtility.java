package com.ashu.util;

import com.ashu.dao.IUserDAO;
import com.ashu.dao.UserDAO;
import com.ashu.dao.UserDAOVersion2;

public class DAOUtility {

	public static IUserDAO getUserDAO(){
		return new UserDAOVersion2();
	}
}
