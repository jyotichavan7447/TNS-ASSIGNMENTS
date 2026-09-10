package com.accessModifires;

public class DefaultDemo {

    int number = 30;   // default

    void display() {
        System.out.println("Default number = " + number);
    }

    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.display();
    }
}