package com.xworkz.interview;

import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
	
	public static void main(String args[]) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fisrt number");
		a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second number");
		b = sc.nextInt();
		
		System.out.println("Before swaping " + a + " " +b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swaping");
		System.out.println(a + " " + b);
	}

}
