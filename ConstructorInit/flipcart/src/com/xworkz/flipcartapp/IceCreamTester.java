package com.xworkz.flipcartapp;

public class IceCreamTester {
	
	public static void main(String args[]) {
		
		IceCream.address = "Rajajinagar";
		
		IceCream ice = new IceCream("S45", "Arun", "Cup", "Butter Scoch", "400g", 200);
		System.out.println("Ice cream ddeatils are..");
		System.out.println(ice.iceCreamId + " "+ ice.name + " "+ ice.type + " "+ ice.flavour + " "+ ice.quantity + " "+ ice.price);
		System.out.println(IceCream.address);
		
		IceCream ice1 = new IceCream("S46", "Wadilal", "Candy", "Strauberry", "800g", 500);
		System.out.println(ice1.iceCreamId + " "+ ice1.name + " "+ ice1.type + " "+ ice1.flavour + " "+ ice1.quantity + " "+ ice1.price);
		System.out.println(IceCream.address);
		
		IceCream ice2 = new IceCream("S47", "Cream bell", "Cone", "Chocolate", "300g", 400);
		System.out.println(ice2.iceCreamId + " "+ ice2.name + " "+ ice2.type + " "+ ice2.flavour + " "+ ice2.quantity + " "+ ice2.price);
		System.out.println(IceCream.address);
	}

}
