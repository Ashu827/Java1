package com.ashu.util;

public class User {

	String name;
	static String password;
	static String confirmpassword;
	String email;
	String sex;
	String country;
	String securityquestion;
	String securityanswer;
	public User(String name, String email, String sex, String country,
			String securityquestion, String securityanswer) {
		super();
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.country = country;
		this.securityquestion = securityquestion;
		this.securityanswer = securityanswer;
	}
	public User(String userName, String password2, String confirmpassword2,
			String email2, String sex2, String country2,
			String securityquestion2, String securityanswer2) {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String securityquestion2,
			String securityanswer2) {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		User.password = password;
	}
	public static String getConfirmpassword() {
		return confirmpassword;
	}
	public static void setConfirmpassword(String confirmpassword) {
		User.confirmpassword = confirmpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSecurityquestion() {
		return securityquestion;
	}
	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	public String getSecurityanswer() {
		return securityanswer;
	}
	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", sex=" + sex
				+ ", country=" + country + ", securityquestion="
				+ securityquestion + ", securityanswer=" + securityanswer + "]";
	}
	
	
}
