package com.ashu.pojo;

public class User {
	
	String userName;
	String password;
	String userType;
	public User(String userName, String password, String type) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String type) {
		this.userType = type;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", type=" + userType + "]";
	}
	
	

}
