package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Flipcart;
import com.xworkz.inheritance.fruit.Ecommarce;

public class EcommarceTester {
	
	public static void main(String args[]) {
		
		Ecommarce com = new Ecommarce();
		com.toBuyProducts("Mesho");
		System.out.println("One of the famous ecommece website is" + com.product);
		
		Flipcart com1 = new Flipcart();
		com1.toBuyProducts("Dress");
		System.out.println("Famous product in flipcart is"  + com1.product);
		
		com.toMakeShopping();
		
		
		
		
	}
	

}
