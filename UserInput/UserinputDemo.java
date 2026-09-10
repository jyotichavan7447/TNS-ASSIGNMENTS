package com.userInput_methods;
import java.util.Scanner;

public class UserinputDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Roll Number: ");
		int Roll_no= sc.nextInt();
		
		System.out.println("Enter the your Full Name::");
		String nme =sc.next(); 
		
		System.out.println(" Roll No== " +Roll_no + " Name== " + nme);
		
		
		sc.close();
		
		
		

	}

}
