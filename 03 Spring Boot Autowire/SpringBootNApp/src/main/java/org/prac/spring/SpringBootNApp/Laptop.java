package org.prac.spring.SpringBootNApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private static Logger LOGGER=LoggerFactory.getLogger(Laptop.class);
	public void compile() {
		LOGGER.info("{}","In Laptop Class");
	}
}
