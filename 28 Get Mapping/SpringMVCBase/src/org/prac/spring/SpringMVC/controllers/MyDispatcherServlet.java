package org.prac.spring.SpringMVC.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"org.prac.spring.SpringMVC"})
public class MyDispatcherServlet {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
