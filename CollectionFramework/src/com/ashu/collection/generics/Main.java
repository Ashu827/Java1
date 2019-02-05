package com.ashu.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		MyList<Employee> emp =new MyList<Employee>();
		emp.add(new Employee("Ashutosh", 12345));
		emp.getAdd();
		emp.add(new Employee("Siddhartha", 123));
		emp.getAdd();
		
		
		System.out.println(emp.getAll());
		
		
		Account account=new Account("Ashutosh",123456789);
		Account account2=new Account("Siddhartha", 987654321);
		
		MyList<Account> acc=new MyList<Account>();
		acc.add(account);
		acc.add(account2);
		
		
		
	
		

	}


}
