package com.rashmi.sql;

import java.util.ArrayList;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		ArrayList<Employees> array = new ArrayList<Employees>();
		
		array.add(new Employees(7369, "smith", "clerk", 7902, 800, 0, 20));
		array.add(new Employees(7499, "allen", "salesman", 7698, 1600, 300, 30));
		array.add(new Employees(7521, "ward", "salesman", 7698, 1250, 500, 30));
		array.add(new Employees(7566, "jones", "manager", 7839, 2975, 0, 20));
		array.add(new Employees(7654, "martin", "salesman", 7698, 1250, 1400, 30));
		array.add(new Employees(7698, "blake", "manager", 7839, 2850, 0, 30));
		array.add(new Employees(7782, "clark", "manager", 7839, 2450, 0, 10));
		array.add(new Employees(7788, "scott", "analyst", 7566, 3000, 0, 20));
		array.add(new Employees(7839, "king", "president", 0, 5000, 0, 10));
		array.add(new Employees(7844, "turner", "salesman", 7698, 1500, 0, 30));
		array.add(new Employees(7876, "adams", "clerk", 7788, 1100, 0, 20));
		array.add(new Employees(7900, "james", "clerk", 7698, 950, 0, 30));
		array.add(new Employees(7902, "ford", "analyst", 7566, 3000, 0, 20));
		array.add(new Employees(7934, "miller", "clerk", 7782, 1300, 0, 10));
		


MyDate d1=new MyDate(01,12,2011);
	new MyDate(02,11,2012);
	new MyDate(11,10,2011);
	MyDate d4=new MyDate(12,9,2015);
	MyDate d5=new MyDate(13,8,2016);
	MyDate d6=new MyDate(14,7,2017);
	MyDate d7=new MyDate(14,7,2018);
	MyDate d8=new MyDate(14,7,2019);
	MyDate d9=new MyDate(14,8,2017);
	MyDate d10=new MyDate(14,9,2017);
	MyDate d11=new MyDate(14,10,2017);
	MyDate d12=new MyDate(14,11,2017);
	MyDate d13=new MyDate(14,12,2017);
	MyDate d14=new MyDate(14,7,2018);

array.add(new EmployeeTable(7369, "smith", "clerk", 7902, 800, 0, 20,d1));
	array.add(new EmployeeTable(7499, "allen", "salesman", 7698, 1600, 300, 30,d2));
	array.add(new EmployeeTable(7521, "ward", "salesman", 7698, 1250, 500, 30,d3));
	array.add(new EmployeeTable(7566, "jones", "manager", 7839, 2975, 0, 20,d4));
	array.add(new EmployeeTable(7654, "martin", "salesman", 7698, 1250, 1400, 30,d5));
	array.add(new EmployeeTable(7698, "blake", "manager", 7839, 2850, 0, 30,d6));
	array.add(new EmployeeTable(7782, "clark", "manager", 7839, 2450, 0, 10,d7));
	array.add(new EmployeeTable(7788, "scott", "analyst", 7566, 3000, 0, 20,d8));
	array.add(new EmployeeTable(7839, "king", "president", 0, 5000, 0, 10,d9));
	array.add(new EmployeeTable(7844, "turner", "salesman", 7698, 1500, 0, 30,d10));
	array.add(new EmployeeTable(7876, "adams", "clerk", 7788, 1100, 0, 20,d11));
	array.add(new EmployeeTable(7900, "james", "clerk", 7698, 950, 0, 30,d12));
	array.add(new EmployeeTable(7902, "ford", "analyst", 7566, 3000, 0, 20,d13));
	array.add(new EmployeeTable(7934, "miller", "clerk", 7782, 1300, 0, 10,d14));
	}

}
