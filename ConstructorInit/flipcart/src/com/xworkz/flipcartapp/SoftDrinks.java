package com.xworkz.flipcartapp;

public class SoftDrinks {
	
	public String drinkId;
	public String brand;
	public String type;
	public String quantity;
	public int price;
	
	public SoftDrinks(String id, String bName, String ty, String qua, int pr) {
		System.out.println("Soft drinks constructor is called..");
		
		drinkId = id;
		brand = bName;
		type = ty;
		quantity = qua;
		price = pr;
		
		
	}
	
	public void toGetEnjoy() {
		System.out.println("Drink for happy moments");
		
	}

}
