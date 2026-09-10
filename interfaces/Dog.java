package com.interfaces;

public class Dog implements Animal {
	
	public void sound() {
        System.out.println("Dog makes sound");
    }

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
    }
}
