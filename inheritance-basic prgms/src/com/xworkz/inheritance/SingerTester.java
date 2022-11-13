package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.CoffeeNaduChandu;
import com.xworkz.inheritance.fruit.Singer;

public class SingerTester {
	
public static void main(String args[]) {
		
        Singer song = new Singer();
		song.toGetWishes("Vijayprakash");
		System.out.println("Singer is good at " + song.name);
		
		CoffeeNaduChandu song1 = new CoffeeNaduChandu();
		song1.toGetWishes("");
	}

}
