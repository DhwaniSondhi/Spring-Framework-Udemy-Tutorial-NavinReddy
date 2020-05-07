package org.prac.spring.SpringBootNApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private static Logger LOGGER=LoggerFactory.getLogger(Person.class);
	@Autowired
	private Laptop laptop;
	
	public void run() {
		laptop.compile();
	}
}
