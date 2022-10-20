package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MilkParlour;

public class MilkParlourTester {
	
	public static void main(String args[]) {
		
		String milkProducts[] = new String[5];
		milkProducts[0] = "Milk";
		milkProducts[1] = "Curd";
		milkProducts[2] = "Peda";
		milkProducts[3] = "Ghee";
		milkProducts[4] = "Lussiee";
		
		int prices[] = new int[5];
		prices[0] = 22;
		prices[1] = 12;
		prices[2] = 100;
		prices[3] = 250;
		prices[4] = 30;
		
		String brandNames[] = new String[5];
		brandNames[0] = "Aarokya";
		brandNames[1] = "Shubham";
		brandNames[2] = "Nandini";
		brandNames[3] = "Hatsun";
		brandNames[4] = "Good life";
		
		MilkParlour milk = new MilkParlour("S123", "Nandini Milk shop", "Mejestic", milkProducts,
				prices, brandNames, 15, 5);
		
		milk.toMakeProducts();
				
	}

}
