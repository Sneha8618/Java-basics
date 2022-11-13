package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Dhoni;
import com.xworkz.inheritance.fruit.CriketPlayer;

public class CricketPlayerTester {
	
	public static void main(String args[]) {
		
		CriketPlayer cr = new CriketPlayer();
		cr.toPlay(400);
		System.out.println("Cricket player runs are" + cr.runs);
		
		Dhoni cr1 = new Dhoni();
		cr1.toPlay(50);
		System.out.println("Runs scored by dhoni is" + cr1.runs);
		
	
	}
}
