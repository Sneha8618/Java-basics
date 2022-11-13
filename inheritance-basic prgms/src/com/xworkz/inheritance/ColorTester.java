package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Red;
import com.xworkz.inheritance.fruit.Color;

public class ColorTester {
	
	public static void main(String args[]) {
		
		Color clr = new Color();
		clr.toMakeColorfull();
		
		Red clr1 = new Red();
		clr1.forColoringToys("Teddy bears");
		System.out.println("Red color is used for" + clr1.product);
	}

}
