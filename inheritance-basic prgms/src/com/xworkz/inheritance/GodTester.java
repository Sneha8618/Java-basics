package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Ganapati;
import com.xworkz.inheritance.fruit.God;

public class GodTester {
	
	public static void main(String ags[]) {
		
		God gd = new God();
		gd.toGetPeace();
		
		Ganapati gd1 = new Ganapati();
		gd1.isCreator("Rat");
		System.out.println("Vehicle of ganapti is" + gd1.vehicle);
	}

}
