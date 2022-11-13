package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.DairyMilk;
import com.xworkz.inheritance.fruit.Chocolate;
import com.xworkz.inheritance.orange.Kitkat;

public class ChocolateTester {
	
	public static void main(String args[]) {
	
	Chocolate choc = new Chocolate();
	choc.toGetEnjoy("chocos flavour");
	System.out.println("Chocolate falvour is" + choc.flavour);
	
	DairyMilk choc1 = new DairyMilk();
	choc1.toGetEnjoy("Milk flavour");
	System.out.println("Dairymilk flavour is " + choc1.flavour);
	
	Kitkat choc2 = new Kitkat();
	choc2.toGetEnjoy("Orange flavour");
	System.out.println("Kitkat flavour is" +choc2.flavour);

   }
	
}
