package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TempreatureRunner {
	
	public static void main(String[] args) {
		
			
			Map<String, Double> map = new HashMap();
			map.put("Baglkot", 30.5);
			map.put("Banglore", 27.2);
			map.put("Shivmogga", 28.4);
			map.put("Ballary", 26.2);
			map.put("Mysore", 25.7);
			map.put("Gadag", 31.6);
			map.put("Rajsthan", 50.5);
			map.put("Bijapur", 21.4);
			map.put("Rabakavi", 50.5);
			map.put("Muddebihal", 23.7);
			
			System.out.println(map.size());
			if(map.isEmpty()) {
				System.out.println("Map nalli yella idee...");
			}
			else {
				System.out.println("map alli yeneno ide");
			}
			
			System.out.println("Only keys are printed.....");
			Set<String> key = map.keySet();
			key.forEach(e -> System.out.println(e));
			
			System.out.println("Only values are printed.....");
			Collection<Double> value = map.values();
			value.forEach(e -> System.out.println(e));
			
			System.out.println("Both keys and values...");
			Set<Entry<String,Double>> entries = map.entrySet();
		
			for(Entry<String,Double> ref : entries) {
				System.out.println(ref.getKey() + " " + ref.getValue());
			}
			
	 	}
		
}
	

	


