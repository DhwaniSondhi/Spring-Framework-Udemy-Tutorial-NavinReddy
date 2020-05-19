package org.practice.spring.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private int age;
	@Autowired
	private Computer computer;

	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age setter");
		this.age = age;
	}
	
	public Person() {
		System.out.println("Person object created");
	}
	public void run() {
		computer.compile();
	}
	
	
	
}
