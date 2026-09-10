package com.encapsulation;

public class EncapsulationDemo {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setAge(20);

        System.out.println("Age = " + obj.getAge());
    }
}