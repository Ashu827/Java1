package com.ashu.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
	
	
	
	public static void main(String[] args) {
		TreeSet<TreeImplementation> person=new TreeSet<TreeImplementation>(new WeightComparator());
		person.add(new TreeImplementation("Ashu",5,55));
		person.add(new TreeImplementation("Sidd",6,55));
		person.add(new TreeImplementation("viajy",2,65));
		person.add(new TreeImplementation("Ashutosh",5,55));
		
		
		 for(TreeImplementation e:person){
	            System.out.println(e);
	        }
		
	}

}
