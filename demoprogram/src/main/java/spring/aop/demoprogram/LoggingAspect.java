package spring.aop.demoprogram;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@After("execution(public String getMessage())")
	public void LoggingAdvice(){
		System.out.println("Advice run");
	}

}
