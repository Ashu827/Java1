package com.ashu.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<type>
{
	private type display;
	// display[]=new type[5];
			ArrayList<type> arr=new ArrayList<>();
	
		public void getAdd(){
			arr.add(display);
		}
		
		public ArrayList<type> getAll(){
			return arr;
			
		}
	
	
		public void add(type display){
			this.display=display;
		}
		
		public type get(){
			return display;
		}
		
		
}
