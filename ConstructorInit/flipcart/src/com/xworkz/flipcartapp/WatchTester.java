package com.xworkz.flipcartapp;

public class WatchTester {
	
	public static void main(String args[]) {
		
		Watch wat = new Watch("AC234", "Black", "Quartz", 200, "Analog");
		System.out.println("Watch details are..");
		System.out.println(wat.watchId + " "+ wat.color + " "+ wat.brandName + " "+ wat.price + " "+ wat.type);
		
		Watch wat1 = new Watch("AC245", "White", "Titan", 600, "Digital");
		System.out.println(wat1.watchId + " "+ wat1.color + " "+ wat1.brandName + " "+ wat1.price + " "+ wat1.type);
		
		Watch wat2 = new Watch("AS123", "Grey", "White Stone", 500, "Smart");
		System.out.println(wat2.watchId + " "+ wat2.color + " "+ wat2.brandName + " "+ wat2.price + " "+ wat2.type);
		
		Watch wat3 = new Watch("AS345", "Green", "Noise", 3000, "Smart");
		System.out.println(wat3.watchId + " "+ wat3.color + " "+ wat3.brandName + " "+ wat3.price + " "+ wat3.type);
		
		Watch wat4 = new Watch("AS675", "Brown", "Adam", 1500, "Analog");
		System.out.println(wat4.watchId + " "+ wat4.color + " "+ wat4.brandName + " "+ wat4.price + " "+ wat4.type);
	}

}
