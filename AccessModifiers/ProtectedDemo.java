package com.accessModifires;

public class ProtectedDemo {

    protected int number = 20;

    protected void display() {
        System.out.println("Protected number = " + number);
    }

    public static void main(String[] args) {
        ProtectedDemo obj = new ProtectedDemo();
        obj.display();
    }
}