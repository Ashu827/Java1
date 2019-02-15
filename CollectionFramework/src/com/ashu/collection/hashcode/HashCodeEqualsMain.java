package com.ashu.collection.hashcode;

public class HashCodeEqualsMain {

	
	public static void main(String[] args) {
		 HashCodeEquals g1 = new HashCodeEquals("abc", 1); 
		 HashCodeEquals g2 = new HashCodeEquals("abc", 1); 
		 HashCodeEquals g3 = new HashCodeEquals("aa", 1); 
	          
	        // comparing above created Objects. 
	        if(g1.hashCode() == g2.hashCode()) 
	        { 
	  
	            if(g1.equals(g2)) 
	                System.out.println("Both Objects are equal. "); 
	            else
	                System.out.println("Both Objects are not equal. "); 
	    }  
	}
}
