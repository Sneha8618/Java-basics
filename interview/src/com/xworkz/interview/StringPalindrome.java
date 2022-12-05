package com.xworkz.interview;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		String str="";
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String stringInput = sc.next();
		
		char[] resultarray = stringInput.toCharArray();
		
		for(int i=resultarray.length-1; i>=0; i--) {
			
			System.out.print(resultarray[i]);
			str = str + resultarray[i];
		}
		
		if(stringInput.equals(str)) {
			System.out.print("Is Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}
}
