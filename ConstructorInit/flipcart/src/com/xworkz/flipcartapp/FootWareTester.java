package com.xworkz.flipcartapp;

public class FootWareTester {
	
    public static void main(String args[]) {
		
	    FootWare foot = new FootWare("S45", "Bata", "Black", "Shoe", 700);
	    System.out.println("Foor ware deatils are..");
	    System.out.println(foot.footId + " "+ foot.brand + " "+ foot.color + " "+ foot.type + " "+ foot.price);
		
		
	    FootWare foot1 = new FootWare("S46", "Walkmate", "Red", "Flat", 500);
	    System.out.println(foot1.footId + " "+ foot1.brand + " "+ foot1.color + " "+ foot1.type + " "+ foot1.price);
		
	    FootWare foot2 = new FootWare("A47", "Lunarce", "Blue", "Sandal", 300);
	    System.out.println(foot2.footId + " "+ foot2.brand + " "+ foot2.color + " "+ foot2.type + " "+ foot2.price);
	}

}
