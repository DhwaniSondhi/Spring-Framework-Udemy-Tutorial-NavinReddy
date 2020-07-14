package org.prac.spring.SpringMVCBootDemo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(public * org.prac.spring.SpringMVCBootDemo.PersonController.getPersons())")
	public void getLogBefore() {
		LOGGER.info("{}", "The getPersons started.");
	}

	@AfterReturning("execution(public * org.prac.spring.SpringMVCBootDemo.PersonController.getPersons())")
	public void getLogAfter() {
		LOGGER.info("{}", "The getPersons finished without exception.");
	}

	@AfterThrowing("execution(public * org.prac.spring.SpringMVCBootDemo.PersonController.getPersons())")
	public void getLogException() {
		LOGGER.info("{}", "The getPersons exception thrown.");
	}
}
