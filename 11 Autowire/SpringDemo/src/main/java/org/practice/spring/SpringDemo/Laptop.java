package org.practice.spring.SpringDemo;

public class Laptop implements Computer{
	
	public Laptop() {
		System.out.println("Laptop object created");
	}
	public void compile() {
		System.out.println("Compiler in LAptop");
	}
}
