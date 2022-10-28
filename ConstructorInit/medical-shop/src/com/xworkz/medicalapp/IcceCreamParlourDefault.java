package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.IceCreamParlour;

public class IcceCreamParlourDefault {
	
	public static void main(String args[]) {
		
		IceCreamParlour ice = new IceCreamParlour();
		ice.gstNo = "MS234";
		ice.name = "Sneha Parlour";
		ice.address = "Manyata Tech park";
		
		ice.brandNames = new String[4];
		ice.brandNames[0] = "Arun";
		ice.brandNames[1] = "Waadilal";
		ice.brandNames[2] = "Amul";
		ice.brandNames[3] = "Hangose";
		
		ice.flavours = new String[4];
		ice.flavours[0] = "Strauberry";
		ice.flavours[1] = "Venilla";
		ice.flavours[2] = "Butter scoch";
		ice.flavours[3] = "Chocolate";
		
		ice.typesOfIceCreams = new String[4];
		ice.typesOfIceCreams[0] = "Cup"; 
		ice.typesOfIceCreams[1] = "Cone";
        ice.typesOfIceCreams[2] = "Candy";
        ice.typesOfIceCreams[3] = "Chocobar";
        
        ice.prices = new int[5];
        ice.prices[0] = 20;
        ice.prices[1] = 50;
        ice.prices[2] = 60;
        ice.prices[3] = 80;
        ice.prices[4] = 45;
        
        ice.toGetEnjoy();
	}

}
