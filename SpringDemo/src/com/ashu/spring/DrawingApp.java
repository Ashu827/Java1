package com.ashu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


@SuppressWarnings("deprecation")
public class DrawingApp {

	
	public static void main(String[] args) {
		
		//Triangle triangle=new Triangle();
		
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring1.xml"));
		Triangle triangle= (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
