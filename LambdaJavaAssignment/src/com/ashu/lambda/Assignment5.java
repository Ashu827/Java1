package com.ashu.lambda;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment5 {

	public static void main(String[] args) {

		StringBuilder builder=new StringBuilder();


		Consumer<List<String>> print=list->list.stream()
				.forEach(s -> builder.append(s.charAt(0)));
		List<String> list = new ArrayList<String>();    	
		list.add("Ashutosh");
		list.add("Ram");
		list.add("Siddhartha"); 
		list.add("Vijay");
		list.add("Ajay");

		print.accept(list);
		System.out.println(builder);



	}
}
