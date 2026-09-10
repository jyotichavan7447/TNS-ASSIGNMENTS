package com.inheritance_singlelevel;

public class Student extends Person  {
	int age;
	String name;
	
	public Student(String name, int age, long contactNO) {
		super(name, age, contactNO);
		this.name=name;
		this.age=age;
		
		
	}

	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	
	
	@Override
	public String toString() {
		return super.toString() +"\nStudent [age=" + age + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		
		
		Student st =new Student("komal",21,9075367721l);
		System.out.println(st);
		//st.Person("jyoti",21,7447733434l);
	
		
		

	}

	

}
