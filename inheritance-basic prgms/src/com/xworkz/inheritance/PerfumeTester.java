package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Fog;
import com.xworkz.inheritance.fruit.Perfume;

public class PerfumeTester {

	public static void main(String args[]) {
		
		Perfume per = new Perfume();
		per.toGetFreshness(400);
		System.out.println("Price of perfume is" +per.price);
		
		Fog per1 = new Fog();
		per1.toGetFreshness(500);
		per1.toGetFragrated("Lilly");
		System.out.println("Price of fog is" +per1.price);
		System.out.println("Fragrant of fog is" + per1.fragrant);
	}
}
