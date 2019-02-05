package com.ashu.collection.generics;

public class Employee {
	
	String Ename;
	int Eid;
	public Employee(String ename, int eid) {
		super();
		Ename = ename;
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", Eid=" + Eid + "]";
	}
	
	
	

}
