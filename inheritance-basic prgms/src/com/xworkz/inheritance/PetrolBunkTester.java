package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.HP;
import com.xworkz.inheritance.fruit.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String args[]) {
		
		PetrolBunk petr = new PetrolBunk();
		petr.toGetFuels(89.4);
		System.out.println("Petrol price is" + petr.price);
		
		HP petr1 = new HP();
		petr1.toGetFuels(95.2);
		System.out.println("Hp petrol bunk orice is" + petr1.price);
	}

}
