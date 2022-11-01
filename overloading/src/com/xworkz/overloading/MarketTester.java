package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.Market;

public class MarketTester {
	
	public static void main(String args[]) {
		
		String vegetables[] = {"Onion", "Tomato", "Chilly", "Brinjal", "Ladyfingure"};
	
		Market mar = new Market(vegetables);
		
		mar.displayDetails();
		
	}
		

}
