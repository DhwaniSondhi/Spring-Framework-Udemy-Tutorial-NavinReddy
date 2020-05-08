package org.practice.spring.SpringDemo;

public class Desktop implements Computer{
	
	public Desktop() {
		System.out.println("Desktop object created");
	}
	public void compile() {
		System.out.println("Compiler in Desktop");
	}
}
