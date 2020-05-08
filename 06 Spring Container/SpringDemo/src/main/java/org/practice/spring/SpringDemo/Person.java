package org.practice.spring.SpringDemo;

public class Person {
	
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		System.out.println("Person object created");
	}
	public void run() {
		System.out.println("Running");
	}
}
