package org.prac.spring.SpringBootNApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootNAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootNAppApplication.class, args);
		Person p=context.getBean(Person.class);
		p.run();
	}

}
