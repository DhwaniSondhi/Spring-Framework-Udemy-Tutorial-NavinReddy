package org.prac.spring.SpringMVCBootDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"org.prac.spring.SpringMVCBootDemo"})
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
