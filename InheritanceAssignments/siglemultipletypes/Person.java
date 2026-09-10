package com.inheritance_singlelevel;

public class Person {
	
	private String  name;
	private int age;
	private long contactNO;
	public Person(String name, int age, long contactNO) {
		
		this.name = name;
		this.age = age;
		this.contactNO = contactNO;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContactNO() {
		return contactNO;
	}
	public void setContactNO(long contactNO) {
		this.contactNO = contactNO;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNO=" + contactNO + "]";
	}
	
	
	
	

}


	

