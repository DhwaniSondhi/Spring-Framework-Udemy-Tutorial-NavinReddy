package org.prac.spring.SpringBootNApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private static Logger LOGGER=LoggerFactory.getLogger(Person.class);
	public void run() {
		LOGGER.info("{}","In PErson Class");
	}
}
