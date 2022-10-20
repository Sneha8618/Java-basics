package com.xworkz.flipcartapp;

public class IronBox {
	
	public String ironId;
	public String name;
	public String type;
	public int price;
	
	public IronBox(String id, String nm, String ty, int pr) {
		System.out.println("Iron box constructor is initialized..");
		
		ironId = id;
		name = nm;
		type = ty;
		price = pr;
		
		
	}
	
	public void toGetIron() {
		System.out.println("To iron the clothes");
		
	}

}
