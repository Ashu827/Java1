package com.ashu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.sound.sampled.ReverbType;

public class Assignment3 {

	public static void main(String[] args) {
		
	ArrayList<Integer> array=new ArrayList<Integer>();
	 
	array.add(1);
	array.add(5);
	array.add(3);
	array.add(4);
	array.add(7);
	array.add(8);
	System.out.print("before "+array);
	System.out.println();
	ListIterator itr=array.listIterator(array.size());
	while(itr.hasPrevious()){
		System.out.print(itr.previous()+" ");
	}
	
	
	}
}
