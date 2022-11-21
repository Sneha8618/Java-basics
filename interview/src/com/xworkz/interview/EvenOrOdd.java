package com.xworkz.interview;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String args[]) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
	     num = sc.nextInt();
	     System.out.println("Enter number" +num);
		
		if(num % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			
			System.out.println("Number is odd");
		}
		sc.close();
		
	}

}
