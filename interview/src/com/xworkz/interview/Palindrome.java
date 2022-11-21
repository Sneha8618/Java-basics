package com.xworkz.interview;

public class Palindrome {
	
	public static void main(String args[]) {
		
		int num = 121, rev = 0;
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


