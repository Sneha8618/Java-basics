package com.xworkz.flipcartapp;

public class IronBoxTester {
	
public static void main(String args[]) {
		
	    IronBox iron = new IronBox("A34", "Usha", "Pure iron", 700);
	    System.out.println("Iron box deatils are..");
	    System.out.println(iron.ironId + " "+ iron.name + " "+ iron.type + " "+ iron.price);
		
		
	    IronBox iron1 = new IronBox("A35", "Philips", "Aerosol iron", 500);
		System.out.println("Iron box deatils are..");
		System.out.println(iron1.ironId + " "+ iron1.name + " "+ iron1.type + " "+ iron1.price);
		
		IronBox iron2 = new IronBox("A35", "Bajaj", "Milk powder iron", 600);
		System.out.println("Iron box deatils are..");
		System.out.println(iron2.ironId + " "+ iron2.name + " "+ iron2.type + " "+ iron2.price);
	}

}
