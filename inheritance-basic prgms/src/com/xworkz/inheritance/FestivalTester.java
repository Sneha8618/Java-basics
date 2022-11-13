package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Diwali;
import com.xworkz.inheritance.fruit.Festival;

public class FestivalTester {
	
	public static void main(String args[]) {
		
	Festival fest = new Festival();
	fest.toCelebrate(250);
	System.out.println("Minimun amoutn of crakers is" + fest.priceOfCrackers);
	
	Diwali fest1 = new Diwali();
	fest1.toCelebrate(1000);
	System.out.println("Amoutn of crackers in diwali is" + fest1.priceOfCrackers);
		
	}

}
