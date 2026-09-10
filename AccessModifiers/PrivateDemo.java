package com.accessModifires;

public class PrivateDemo {

    private int number = 40;

    private void display() {
        System.out.println("Private number = " + number);
    }

    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        obj.display();
    }
}