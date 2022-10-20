package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.ChatShop;

public class ChatShopTester {
	
	public static void main(String args[]) {
		
		String chatItems[] = new String[5];
		chatItems[0] = "Gobi manchuri";
		chatItems[1] = "French frices";
		chatItems[2] = "Pani puri";
		chatItems[3] = "Sev puri";
		chatItems[4] = "Pizza";
		
		int itemPrices[] = new int[5];
		itemPrices[0] = 90;
		itemPrices[1] = 100;
		itemPrices[2] = 40;
		itemPrices[3] = 50;
		itemPrices[4] = 300;
		
		String coldDrinks[] = new String[5];
		coldDrinks[0] = "Maaza";
		coldDrinks[1] = "Coco-cola";
		coldDrinks[2] = "Pepsi";
		coldDrinks[3] = "Lussie";
		coldDrinks[4] = "Badam Milk";
		
		ChatShop chat = new ChatShop("SA342515678", "Rajajinagar", "Laxmi Sgar", chatItems, itemPrices, 
				     coldDrinks, 20);
		
		chat.toGetInfo();
	}

}
