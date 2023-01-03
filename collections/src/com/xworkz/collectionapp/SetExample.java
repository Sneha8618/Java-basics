package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet();
		set.add("Sneha");
		set.add("Sneha");
		set.add("Sahana");
		set.add("Swati");
		set.add("Vishala");
		set.add("Muskan");
		set.add("Anu");
		
		for(String value : set) {
			System.out.println(value);
			
		}
		
		System.out.println("**********************Integer values");
		Set<Integer> set1 = new HashSet();
		set1.add(23);
		set1.add(24);
		set1.add(24);
		set1.add(26);
		set1.add(25);
		
		for(Integer ref : set1) {
			System.out.println(ref);
		}
	}

}
