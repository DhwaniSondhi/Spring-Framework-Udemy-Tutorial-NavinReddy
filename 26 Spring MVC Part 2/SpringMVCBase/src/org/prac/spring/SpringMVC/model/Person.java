package org.prac.spring.SpringMVC.model;

public class Person {

	private int id;
	private String name;
	
	public Person() {
		super();
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public static class PersonBuilder{
		private int id;
		private String name;
		public PersonBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public PersonBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public Person build() {
			return new Person(id, name);
		}
	}
}
