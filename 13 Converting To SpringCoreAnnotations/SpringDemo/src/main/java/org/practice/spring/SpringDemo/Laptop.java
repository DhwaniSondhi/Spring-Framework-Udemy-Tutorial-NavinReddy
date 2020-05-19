package org.practice.spring.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	
	public Laptop() {
		System.out.println("Laptop object created");
	}
	public void compile() {
		System.out.println("Compiler in LAptop");
	}
}
