package com.xworkz.interview;

import java.util.Scanner;

public class Fibonacciee {
	
	public static void main(String rags[]) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		
		int f1 = 0, f2 = 1, f3;
		
		for(int i = 1; i <= num; i++) {
		f3 = f1 + f2;
		System.out.println(f3);
		f1 = f2;
		f2 = f3;
		
		}
		
	}
	
}

