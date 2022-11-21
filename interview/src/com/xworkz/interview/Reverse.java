package com.xworkz.interview;

public class Reverse {
	
	public static void main(String args[]) {
		
		int number = 1234 , rev = 0;
		/*int temp; */
		
		while(number > 0) {
			int rem = number % 10;
			rev = rev * 10 + rem;
		}	
			
		System.out.println("Reverse number is" +rev);
			
			
		}
		
	}


