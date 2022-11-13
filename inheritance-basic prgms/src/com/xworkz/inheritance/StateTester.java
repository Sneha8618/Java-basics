package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Karnatak;
import com.xworkz.inheritance.fruit.State;

public class StateTester {
	
	public static void main(String args[]) {
		
		State st = new State();
		st.stateOfIndia(29);
		System.out.println("Number of states in india" + st.noOfDistricts);
		
		Karnatak st1 = new Karnatak();
		st1.stateOfIndia(32);
		System.out.println("Number of districts in karnatak" +st1.noOfDistricts);
	}

}
