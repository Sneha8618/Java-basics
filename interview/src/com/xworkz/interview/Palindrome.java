package com.xworkz.interview;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) {
		
		int num, rev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		
		int temp = num;
		
		while(num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(temp == rev) {
			System.out.println("Number is palindrome");
		}
			else{
				System.out.println("Number is not a palindrome");
				}
			}
	}


