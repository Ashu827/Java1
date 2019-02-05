package com.ashu.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<>();    	
			list.add("Ashutosh");
			list.add("Ram");
			list.add("Siddhartha"); 
			list.add("Vijay");
			
			list.removeIf(word->(word.length() %2!=0));
				System.out.println(list);
			
	}

}
