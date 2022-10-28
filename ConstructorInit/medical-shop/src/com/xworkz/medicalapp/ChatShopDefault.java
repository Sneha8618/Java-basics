package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.ChatShop;

public class ChatShopDefault {
	
	public static void main(String args[]) {
		
		ChatShop chat = new ChatShop();
		chat.gstNo = "ACG34";
		chat.address = "Jp nagar";
		chat.name = "Ganesh center";
		chat.noOfItems = 15;
		
	    chat.chatNames = new String[5];
		chat.chatNames[0] = "Gobi manchuri";
		chat.chatNames[1] = "French frices";
		chat.chatNames[2] = "Pani puri";
		chat.chatNames[3] = "Sev puri";
		chat.chatNames[4] = "Pizza";
		
		chat.itemPrices = new int[5];
		chat.itemPrices[0] = 90;
		chat.itemPrices[1] = 100;
		chat.itemPrices[2] = 40;
		chat.itemPrices[3] = 50;
		chat.itemPrices[4] = 300;
		
		chat.coldDrinks = new String[5];
		chat.coldDrinks[0] = "Maaza";
		chat.coldDrinks[1] = "Coco-cola";
		chat.coldDrinks[2] = "Pepsi";
		chat.coldDrinks[3] = "Lussie";
		chat.coldDrinks[4] = "Badam Milk";
		
		chat.toGetInfo();
		
	}

}
