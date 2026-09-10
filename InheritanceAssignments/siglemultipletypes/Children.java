package com.inheritance_multilevel;

public class Children extends Parents {
	
	private  String name;
	private int age;
	public Children(String name, int age,String pname, int page,String gname,int gage,boolean alive) {
		super(pname,page,gname,gage,alive);
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return super.toString() +"\nChildren [name=" + name + ", age=" + age + "]";
	}

	

}
