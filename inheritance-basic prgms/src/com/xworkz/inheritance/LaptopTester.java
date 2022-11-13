package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Lenovo;
import com.xworkz.inheritance.fruit.Laptop;

public class LaptopTester {
	
	public static void main(String args[]) {
		
		Laptop lp = new Laptop();
		lp.toStoreData("core i3");
		System.out.println("Laptop processor type is" + lp.processorType);
		
		Lenovo lp1 = new Lenovo();
		lp1.gamingPurpose(30000);
		System.out.println("Lenovo price is" + lp1.price);
		
	}

}
