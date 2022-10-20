package com.xworkz.medicalapp.medicalshop;

public class ChatShop {
	
	public String gstNo;
	public String address;
	public String name;
	public String chatNames[];
	public int itemPrices[];
	public String coldDrinks[];
	public int noOfItems;
	
	public ChatShop(String gstNo, String address, String name, String chatNames[], int itemPrices[],
			String coldDrinks[], int noOfItems) {
		System.out.println("Chat shop object is created");
		this.gstNo = gstNo;
		this.address = address;
		this.name = name;
		this.chatNames = chatNames;
		this.itemPrices = itemPrices;
		this.coldDrinks = coldDrinks;
		this.noOfItems = noOfItems;
		
	}
	
	public void toGetInfo() {
		System.out.println("Chat shop gst no is" + gstNo);
		System.out.println("******************************");
		System.out.println("Chat shop address is " + address);
		System.out.println("******************************");
		System.out.println("Chat shop name is" + name);
		System.out.println("******************************");
		System.out.println("Number of items are");
		System.out.println("******************************");
		
		System.out.println("Chat names are");
		for(int i = 0; i < chatNames.length; i++) {
			System.out.println(chatNames[i]);
		}
		System.out.println("******************************");
		System.out.println("Item prices are");
		for(int i = 0; i < itemPrices.length; i++) {
			System.out.println(itemPrices[i]);
		}
		System.out.println("******************************");
		System.out.println("Cold drik names are");
		for(int i = 0; i < coldDrinks.length; i++ ) {
			System.out.println(coldDrinks[i]);
		}
		
		
		
	}
	
	

}
