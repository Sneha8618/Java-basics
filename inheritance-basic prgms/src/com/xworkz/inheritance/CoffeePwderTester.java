package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Levista;
import com.xworkz.inheritance.fruit.CoffeePowder;

public class CoffeePwderTester {
	
	public static void main(String args[]) {
		
		CoffeePowder cf = new CoffeePowder();
		cf.toMakeCoffee("Bruu");
		System.out.println("The famous coffee powder is " + cf.name);
		
		Levista cf1 = new Levista();
		cf1.toMakeCoffee("Levista");
		System.out.println("Most tastiest coffee powder is " + cf1.name);
	}

}
