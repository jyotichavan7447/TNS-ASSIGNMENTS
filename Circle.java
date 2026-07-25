package com.constructor_assignments_no3;
import java.util.Scanner;


public class Circle {
	
	double radius;
	String colour;
	double area ;
	
	
	public void getInput(Scanner sc) 
	{
		System.out.println("enter circle radius:");
		radius= sc.nextDouble();
		
		System.out.println("enter circle colour name:");
		colour= sc.next();
		
		
	
	}
	
	public void calArea()
	{
		
		 area =3.14*radius*radius;
		System.out.println("\nCircle Details");
        System.out.println("-----------------------");
        System.out.println("Radius : " + radius);
        System.out.println("Colour : " + colour);
        System.out.println("Area of Circle : " + area);	
		
	}

	
	public void display()
	{
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Circle cl =new Circle();
		
		cl.getInput(sc);
		cl.calArea();
		
		sc.close();
	}

}
