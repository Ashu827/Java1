package com.ashu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
       
       Hello helo= context.getBean(Hello.class);
       helo.hiii();
    }
}
