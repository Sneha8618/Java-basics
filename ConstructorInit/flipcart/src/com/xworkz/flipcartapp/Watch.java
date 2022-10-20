package com.xworkz.flipcartapp;

public class Watch {
	
	public String watchId;
	public String color;
	public String brandName;
	public int price;
	public String type;
	
	public Watch(String id, String clr, String bName, int pr, String ty) {
		
		System.out.println("Watch constructor created");
		watchId = id;
		color = clr;
		brandName = bName;
		price = pr;
		type = ty;
		
	}
	
	public void toSeeTime() {
		System.out.println("Time is precious");
	}

}
