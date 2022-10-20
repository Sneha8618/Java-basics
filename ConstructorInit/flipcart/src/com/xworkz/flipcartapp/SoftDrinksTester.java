package com.xworkz.flipcartapp;

public class SoftDrinksTester {
	
public static void main(String args[]) {
		
	    SoftDrinks drink = new SoftDrinks("D89", "Pepsi", "lemon-lime", "500ml", 50);
	    System.out.println("Soft drinks deatils are..");
	    System.out.println(drink.drinkId + " "+ drink.brand + " "+ drink.type + " "+ drink.quantity + " "+ drink.price);
		
		
	    SoftDrinks drink1 = new SoftDrinks("D90", "Coco-cola", "cola", "800ml", 80);
	    System.out.println(drink1.drinkId + " "+ drink1.brand + " "+ drink1.type + " "+ drink1.quantity + " "+ drink1.price);
		
	    SoftDrinks drink2 = new SoftDrinks("D90", "Fruity", "Orange", "250ml", 30);
	    System.out.println(drink2.drinkId + " "+ drink2.brand + " "+ drink2.type + " "+ drink2.quantity + " "+ drink2.price);
	}

}
