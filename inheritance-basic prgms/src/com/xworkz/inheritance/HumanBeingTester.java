package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Dev;
import com.xworkz.inheritance.fruit.HumanBeing;

public class HumanBeingTester {

	public static void main(String args[]) {
		
		HumanBeing hb = new HumanBeing();
		hb.toHelpInstitute(25);
		System.out.println("Minimum age.."+hb.age);
		
		Dev dv = new Dev();
		dv.toHelpInstitute(32);
		System.out.println("Dev age is.."+dv.age);
		}
}
