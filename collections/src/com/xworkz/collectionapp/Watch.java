package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class Watch {
	
	public static void main(String args[]) {
		
		String watch1 = "Quartz";
		String watch2 = "Titan";
		String watch3 = "Rolex";
		String watch4 = "Omega";
		String watch5 = "Fastrack";
		String watch6 = "Acnos";
		
		Collection<String> watches = new TreeSet();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);
		watches.add(watch6);
		
		System.out.println(watches);
		
		System.out.println("Accessed using for-each loop");
		for(String element : watches) {
			System.out.println(element);
		}
		
		System.out.println("Accessed using iterator");
		Iterator<String> ref = watches.iterator();
		
		while(ref.hasNext()) {
			String value = ref.next();
			System.out.println(value);
		}
	}

}
