package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MetroCities {
	
	public static void main(String[] args) {
		
		String city1 = "Banglore";
		String city2 = "Hyderabad";
		String city3 = "Chennai";
		String city4 = "Kolkatta";
		String city5 = "Delhi";
		
		Collection<String> cities = new LinkedList();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		
		System.out.println(cities);
		
		for(String element : cities) {
			System.out.println(element);
		}
		
		System.out.println("Access the values using iterator");
		Iterator<String> ref = cities.iterator();
		while(ref.hasNext()) {
			String value = ref.next();
			System.out.println(value);
		}
	}

}
