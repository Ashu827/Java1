package com.ashu.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;





public class Asignment6 {
	
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder();
		
		
		
		List<String> list=new ArrayList<String>();
		list.add("Ashutosh");
		list.add("Ram");
		list.add("Siddhartha"); 
		list.add("Vijay");
		list.add("Ajay");
		
		System.out.println(builder);
		list.replaceAll(str->str.toUpperCase());
		for(String view:list){
		System.out.println(view);
		}		
		
		

	}
}
