package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.GandhadGudi;
import com.xworkz.inheritance.fruit.Documentory;

public class DocumetoryTester {
	
	public static void main(String args[]) {
		
		Documentory doc = new Documentory();
		doc.toWatch("Normal");
		System.out.println("Most of the documentoy films are" + doc.type);
		
		GandhadGudi doc1 = new GandhadGudi();
		doc1.toWatch("HD");
		System.out.println("Gandhadgudi is type of " + doc.type);
		
	}

}
