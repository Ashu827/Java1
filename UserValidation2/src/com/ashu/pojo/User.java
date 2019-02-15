package com.ashu.pojo;

public class User {
	
	String userName;
	String passowrd;
	String userType;
	public User(String userName, String passowrd, String userType) {
		super();
		this.userName = userName;
		this.passowrd = passowrd;
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passowrd=" + passowrd
				+ ", userType=" + userType + "]";
	}
	
	

}
