package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Eye;
import com.xworkz.inheritance.fruit.Organ;

public class OrganTester {

	public static void main(String[] args) {
		
		Organ org = new Organ();
		org.toServive();
		
		Eye ey = new Eye();
		ey.forDifferentActivities("To see");
		System.out.println("Main function of our eye is " + ey.purpose);

	}

}
