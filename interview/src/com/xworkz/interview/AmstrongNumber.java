package com.xworkz.interview;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String args[]) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			n = num % 10;
			num = num / 10;
			sum = sum + (n*n*n);
		}
		if(temp == sum) {
			System.out.println("It is amstrong");
		}
		else {
			System.out.println("Not amstrong");
		}
		
		
		
	}
}
