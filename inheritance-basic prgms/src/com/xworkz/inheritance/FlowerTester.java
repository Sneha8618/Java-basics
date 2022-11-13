package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Rose;
import com.xworkz.inheritance.fruit.Flower;

public class FlowerTester {
	
	public static void main(String args[]) {
		
		Flower flw = new Flower();
		flw.toGetFragrant("Soap");
		System.out.println("One of product of flower is" + flw.products);
		
		Rose flw1 = new Rose();
		flw1.toGetFragrant("Perfume");
		System.out.println("Rose product is" + flw1.products);
	}

}
