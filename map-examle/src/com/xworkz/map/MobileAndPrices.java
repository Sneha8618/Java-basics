package com.xworkz.collectionapp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MobileAndPrices {
	
	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap();
		map.put("MI", 8000.50);
		map.put("Oppo", 12000.50);
		map.put("Vivo", 15000.50);
		map.put("Samsung", 20000.50);
		map.put("Realme", 11000.50);
		map.put("Nokia", 32000.50);
		map.put("Moto", 14000.50);
		map.put("Jio", 7000.50);
		map.put("Lenovo", 16000.50);
		map.put("Poco", 19000.50);
		
		map.forEach((k,v) -> System.out.println("keys: " + k + " values: " + v));
		
		System.out.println("=====================All entries to uppercase....");
		map.forEach((k,v) -> {
			String str = k.toUpperCase();
			System.out.println(str);
		});
		
		System.out.println("=====================Price greater than 10000");
		map.forEach((k,v) -> {
			if(v > 10000) {
				System.out.println(k + " " + v);
				
			}
		});
		
		System.out.println("=====================Keys length is greater than 5 char");
		map.forEach((k,v)-> {
			if(k.length() > 5) {
				System.out.println(k + " " + v);
			}
		});
		
		System.out.println("=====================");
		Set<Entry<String,Double>> ref = map.entrySet();
		ref.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		System.out.println("=====================Entries in desc order");
		ref.stream().
		sorted((a1,a2)-> a2.getKey().compareTo(a1.getKey())).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		
	}

}
