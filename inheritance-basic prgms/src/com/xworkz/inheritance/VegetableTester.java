package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Potato;
import com.xworkz.inheritance.fruit.Vegetable;
import com.xworkz.inheritance.orange.Cauliflower;

public class VegetableTester {
	
	public static void main(String args[]) {
		
		Vegetable veg = new Vegetable();
		veg.toMakeRecipees("Phalav");
		System.out.println("Vegetables are used to make" + veg.recipee);
		
		Potato veg1 = new Potato();
		veg1.toMakeRecipees("French fries");
		System.out.println("Potato is used to make" + veg1.recipee);
		
		Cauliflower veg2 = new Cauliflower();
		veg2.toMakeRecipees("Gobi Manchuri");
		System.out.println("Cauliflower is used to make" +veg2.recipee);
		
		
		
	}

}
