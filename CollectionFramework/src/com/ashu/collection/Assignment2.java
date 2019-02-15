package com.ashu.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		LinkedHashSet linked=new LinkedHashSet();
		HashSet hash=new HashSet();
		
		linked.add("Ashutosh");
		linked.add("madhuri");
		linked.add("chaya");
		linked.add("varsha");
		linked.add("boat");
		linked.add(1);
		linked.add(5);
		linked.add(4);
		linked.add(7);
		linked.add(2);
		linked.add(9);
		
		System.out.println(linked);
 
		hash.add("A");
		hash.add("m");
		hash.add("c");
		hash.add("v");
		hash.add("boat");
		hash.add(9);
		hash.add(10);
		hash.add(5);
		hash.add(3);
		hash.add(4);
		
	
		System.out.println(hash);
		
		Object [] myObjects = {
				 new Integer(12),
				 new String("foo"),
				 new Integer(5),
				 new Boolean(true)
				 };
				 Arrays.sort(myObjects);
				 System.out.println(myObjects);
				 for(int i=0; i<myObjects.length; i++) {
				 System.out.print(myObjects[i].toString());
				 System.out.print(" ");
				 }
	}

}
