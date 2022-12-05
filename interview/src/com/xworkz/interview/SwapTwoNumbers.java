package com.xworkz.interview;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second number");
		b = sc1.nextInt();
		
		
	    int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping numbers" + a + " "+ b);
	}

}
