package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Apple;
import com.xworkz.inheritance.fruit.Fruit;
import com.xworkz.inheritance.orange.Orange;

public class FruitTester {
	
	public static void main(String args[]) {
		
		Fruit fr = new Fruit();
		fr.toGetHealthier(35);
		System.out.println("Price of the fruit is" + fr.price);
		
		Apple ap = new Apple();
		ap.toGetHealthier(32);
		ap.provideVitamins("Fiber");
		System.out.println("Price of apple is" + ap.price);
		System.out.println("Content in apple is" + ap.content);
		
		Orange orng = new Orange();
		orng.toGetHealthier(30);
		orng.provideVitamins("Vitamin c");
		System.out.println("Price of orange is" + orng.price);
		System.out.println("Content in orange is" + orng.content);
	} 

}
