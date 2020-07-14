package org.prac.spring.SpringMVCBootDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public * org.prac.spring.SpringMVCBootDemo.PersonController.getPersons())")
	public void getLog() {
		System.out.println("Method started");
	}
}
