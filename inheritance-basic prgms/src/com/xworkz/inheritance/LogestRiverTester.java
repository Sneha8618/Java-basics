package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Nile;
import com.xworkz.inheritance.fruit.LongestRiver;

public class LogestRiverTester {
	
public static void main(String args[]) {
		
		LongestRiver lr = new LongestRiver();
		lr.toGetPeace("6600 Kms"); 
		System.out.println("The river flows over..."+lr.flowsOver);
		
		Nile lr1 = new Nile();
		lr1.toGetPeace("4100 miles"); 
		System.out.println("The nile river flows over.."+lr1.flowsOver);
		
				
		
	}

}
