package org.practice.spring.SpringDemo;

public class Person {
	
	private int age;
	private Laptop laptop;
	
	public Person(int age, Laptop laptop) {
		super();
		this.age = age;
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age setter");
		this.age = age;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Person() {
		System.out.println("Person object created");
	}
	public void run() {
		laptop.compile();
	}
	
	
	
}
