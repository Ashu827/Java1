package com.ashu.lambda;

public class Assignment1 {
	
	public static void main(String[] args) {
		MyFunction addition=( a,b)->a+b;
		System.out.println(addition.add(5, 6));
		
		MyFunction substraction=( a,b)->a-b;
		System.out.println(substraction.add(10, 6));
		
		MyFunction multiplication=( a,b)->a*b;
		System.out.println(multiplication.add(5, 6));
		
		MyFunction division=( a,b)->a/b;
		System.out.println(division.add(12, 6));
	}
	
	interface MyFunction{
	int add( int x,int y);
	}

}
