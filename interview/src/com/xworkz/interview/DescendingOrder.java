package com.xworkz.interview;

public class DescendingOrder {
	
	public static void descending(int a[]) {
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[i] < a[j]) {
					
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		
		int a[] = {78, 12, 56, 108, 23, 4, 65};
		
		descending(a);
	}

}
