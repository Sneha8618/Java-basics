package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Chicken;
import com.xworkz.inheritance.fruit.Nonveg;

public class NonvegTeste {
	
	public static void main(String args[]) {
		
		Nonveg veg = new Nonveg();
		veg.toGetProtien("Kabab");
		System.out.println("Most delicious food we made from non veg is " + veg.reciepe);
		
		Chicken veg1 = new Chicken();
		veg1.toGetProtien("Chicken 65");
		System.out.println("One of the chicken recipee is " + veg1.reciepe);
		
	}

}
