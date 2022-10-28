package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MilkParlour;

public class MilkParlourDefault {

	public static void main(String[] args) {
		
		MilkParlour milk = new MilkParlour();
		milk.gstNo = "SE456";
		milk.name = "Nandini";
		milk.address = "Rajajinagar";
		milk.noOfProducts = 20;
		milk.noOfWorkers = 10;
		
		milk.milkProducts = new String[5];
		milk.milkProducts[0] = "Milk";
		milk.milkProducts[1] = "Curd";
		milk.milkProducts[2] = "Peda";
		milk.milkProducts[3] = "Ghee";
		milk.milkProducts[4] = "Lussiee";
		
		milk.prices = new int[5];
		milk.prices[0] = 22;
		milk.prices[1] = 12;
		milk.prices[2] = 100;
		milk.prices[3] = 250;
		milk.prices[4] = 30;
		
		milk.brandNames = new String[5];
		milk.brandNames[0] = "Aarokya";
		milk.brandNames[1] = "Shubham";
		milk.brandNames[2] = "Nandini";
		milk.brandNames[3] = "Hatsun";
		milk.brandNames[4] = "Good life";
		
		milk.toMakeProducts();
		

	}

}
