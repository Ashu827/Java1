package com.ashu.collection.generics;

public class Account {

	
	String Name;
	int AccountNo;
	public Account(String name, int accountNo) {
		super();
		Name = name;
		AccountNo = accountNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	@Override
	public String toString() {
		return "Account [Name=" + Name + ", AccountNo=" + AccountNo + "]";
	}
	
	
}
