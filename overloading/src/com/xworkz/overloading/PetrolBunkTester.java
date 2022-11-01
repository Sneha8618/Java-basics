package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String args[]) {
		
		String workersName[] = {"Akash", "Sumanth", "Sneha", "Sushma", "Navya", "Sagar", "Vinayak"};
		PetrolBunk bunk = new PetrolBunk(workersName);
		
		bunk.displayDetails();
		
	}

}
