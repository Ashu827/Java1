package com.ashu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashu.assignment2.MapQuestion;
import com.ashu.assignment2.Question;

public class Test {

	public static void main(String[] args) {
	
		 
		       @SuppressWarnings("resource")
//			   ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
//		       Customer customer= (Customer) context.getBean("info");
		       ApplicationContext context =new ClassPathXmlApplicationContext("spring1.xml");
//		       Question question= (Question) context.getBean("list");
//		       System.out.println("List");
//		       question.display();
//		       System.out.println();
//		       System.out.println();
//		       Question question1= (Question) context.getBean("set");
//		       System.out.println("Set");
//		       question1.display();
		       MapQuestion question2= (MapQuestion) context.getBean("map");
		       System.out.println("Map");
		       question2.show();
		   }

}
