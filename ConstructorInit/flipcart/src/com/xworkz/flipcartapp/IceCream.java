package com.xworkz.flipcartapp;

public class IceCream {
	
	static public String address;
	
	public String iceCreamId;
	public String name;
	public String type;
	public String flavour;
	public String quantity;
	public int price;
	
	public IceCream(String id, String nm, String ty, String flvr, String qua, int pr) {
		System.out.println("Ice cream constructor is called");
		
		iceCreamId = id;
		name = nm;
		type = ty;
		flavour = flvr;
		quantity = qua;
		price = pr;
	}
		
		public void toGetEnjoy() {
			System.out.println("Taste the flavour")	;
		}
				
	}


