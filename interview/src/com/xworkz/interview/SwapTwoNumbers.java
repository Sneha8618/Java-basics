package com.xworkz.interview;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		
		int temp;
		int a = 10;
		int b = 20;
		
		temp = a;
		a = b;
		b = a;
		
		System.out.println("After swapping numbers" + a + " "+ b);
	}

}
