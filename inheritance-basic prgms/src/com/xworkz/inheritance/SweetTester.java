package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Burfi;
import com.xworkz.inheritance.fruit.Sweet;

public class SweetTester {
	
	public static void main(String args[]) {
		
		Sweet sw = new Sweet();
		sw.toMakeSweets();
		
		Burfi sw1 = new Burfi();
		sw1.toMakeRecipe("Coconut");
		System.out.println("Burfi is made up of" +sw1.ingredient);
	}

}
