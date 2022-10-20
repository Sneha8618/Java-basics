package com.xworkz.flipcartapp;

public class FootWare {
	
	public String footId;
	public String brand;
	public String color;
	public String type;
	public int price;
	
	public FootWare(String id, String bName, String clr, String ty, int pr) {
		System.out.println("Foot ware constructor is called..");
		
		footId = id;
		brand = bName;
		color = clr;
		type = ty;
		price = pr;
		
		
	}
	
	public void toGetIron() {
		System.out.println("To iron the clothes");
		
	}

}
