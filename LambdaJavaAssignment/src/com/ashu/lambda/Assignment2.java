package com.ashu.lambda;

import java.util.function.Consumer;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		Consumer<String> consumer = new Consumer<String>(); //ConsumerTest::printNames;
		
		        consumer.accept("C++");
		
		        consumer.accept("Java");
		
		        consumer.accept("Python");
		
		        consumer.accept("Ruby On Rails");
		
		    }
		
		 
		
		    private static void printNames(String name) {       
		
		        System.out.println(name);
		}

	}
