package spring.aop.demoprogram;

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
       @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shape=(ShapeService) context.getBean("ShapeServic");
        System.out.println(shape.getMessage());
        //System.out.println(shape.getTriangle().getName());
        
       
    }
}
