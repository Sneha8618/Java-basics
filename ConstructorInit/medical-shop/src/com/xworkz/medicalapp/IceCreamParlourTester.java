package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.IceCreamParlour;

public class IceCreamParlourTester {

	public static void main(String[] args) {
		
		String brandNames[] = new String[4];
		brandNames[0] = "Arun";
		brandNames[1] = "Waadilal";
		brandNames[2] = "Amul";
		brandNames[3] = "Hangose";
		
		String flavours[] = new String[4];
		flavours[0] = "Strauberry";
		flavours[1] = "Venilla";
		flavours[2] = "Butter scoch";
		flavours[3] = "Chocolate";
		
		String typesOfIceCreams[] = new String[3];
		typesOfIceCreams[0] = "Cup"; 
		typesOfIceCreams[1] = "Cone";
        typesOfIceCreams[2] = "Candy";
        
        int prices[] = new int[4];
        prices[0] = 20;
        prices[1] = 50;
        prices[2] = 60;
        prices[3] = 80;
		
		IceCreamParlour ice = new IceCreamParlour("SM342", "Sneha Parlour", brandNames, flavours,
				typesOfIceCreams, prices, "Manyata tech park", 15);
		
		ice.toGetEnjoy();

	}

}
