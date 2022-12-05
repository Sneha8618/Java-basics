package com.xworkz.interview;

import java.util.Scanner;

public class StringProgram {
	
	public static void main(String args[]) {
		
		//string to charcter array
		String name = "Java Programming";
		 
		System.out.println(name);
		
		//string to char
		//charAt() is a in-built method
		System.out.println("String to character");
		for(int i = 0; i < name.length(); i++) {
			System.out.print(" "+name.charAt(i));
		}
		
		//String reverse
		System.out.println("\nString reverse");
		for(int i = name.length()-1; i >= 0; i--) {
			System.out.print(" "+ name.charAt(i));
			
		}
		
		//counting a given char
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == 'a') {
				//count++
				count += 1;
			}
			
			else {
				count1 ++;
			}
		}
		System.out.print("\ncount of 'a' character");
		System.out.println("\ncount : " + count);
		System.out.print("\nRemaining characters");
		System.out.println("\ncount1 :" + count1);
		
		//String to character without using charAt()
		String str = "Good Learning";
		
		for(char ch:str.toCharArray()) {
			System.out.print(ch+ " ");
		}
		
		//count the characters
		int count2 = 0;
		int count3 = 0;
		for(char ch:str.toCharArray()) {
			if(ch == 'o') {
				count2 ++;
			}
			else {
				count3 ++;
			}
			
		}
		System.out.print("\ncount2 :" + count2);
		System.out.println("\nremaining characters");
		System.out.println("count3 : " +count3);
		
		//comparing original and reverse string
		
		String str1 = "madam";
		String reverse = "";
		System.out.println("\n String to charcter");
		for(int i = 0; i < str1.length(); i++) {
			System.out.print(" " +str1.charAt(i));
		}
		
		//check same or not
		for(int i = str1.length()-1; i >=0; i--) {
			reverse += str1.charAt(i);
		}
		if(str1.equals(reverse)) {
			System.out.println("\n matched");
		}
		else {
			System.out.print("\n not matched");
		}
		
		int count4 = 0;
		int count5 = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == 'a') {
				count4 += 1;
			}
			else {
				count5 ++;
			}
			
		}
		System.out.print("count4 : " +count4);
		System.out.print("\n count5 : " +count5);
	
		
		//without using length method , reverse the given string
		String rev = " ";
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		char[] result = nm.toCharArray();
		
		
		for(int i = result.length-1; i >= 0; i--) {
			System.out.print( " " +result[i]);
			
		}
		
		
		
		
		
		
		
		
		
		 
		
		}
	
	

}
