package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Oreo;
import com.xworkz.inheritance.fruit.Biscuit;

public class BiscuitTester {

public static void main(String args[]) {
		
		Biscuit bis = new Biscuit();
		bis.toEat();
		
		Oreo bis1 = new Oreo();
		bis1.provideVitamins(25);
		System.out.println("Oreo biscuit price is.."+bis1.price);
	}
}
