package com.accessModifires;



public class PublicDemo {

    public int number = 10;

    public void display() {
        System.out.println("Public number = " + number);
    }

    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        obj.display();
    }
}