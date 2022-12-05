package com.xworkz.interview;

import java.util.Scanner;

public class RemoveWhiteSpace {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String name = sc.nextLine();
		
		
		char[] ch = name.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
	}
		
	

}
