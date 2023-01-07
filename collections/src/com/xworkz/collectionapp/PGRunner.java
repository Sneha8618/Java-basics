package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PGRunner {
	
	public static void main(String[] args) {
		
		Map<String,Double> map = new HashMap();
		map.put("Srisai", 4700.50);
		map.put("Khushi", 5000.34);
		map.put("Vishal", 5200.56);
		map.put("Mahalakshmi", 4300.50);
		map.put("Swati", 5600.34);
		map.put("Ganesh", 3500.56);
		map.put("Golden", 4700.50);
		map.put("Vishala", 5000.34);
		map.put("Swapna", 4300.56);
		map.put("Srushti", 5200.56);
		
		System.out.println("=====keys...");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		
		System.out.println("=====values...");
		Collection<Double> values = map.values();
		values.forEach(e -> System.out.println(e));
		
		System.out.println("=====both keys and values...");
		Set<Entry<String,Double>> entries = map.entrySet();
		
		for(Entry<String,Double> ref : entries) {
			System.out.println(ref.getKey() + " " + ref.getValue());
		}
	}

}
