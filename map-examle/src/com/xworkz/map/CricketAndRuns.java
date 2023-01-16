package com.xworkz.collectionapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CricketAndRuns {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		map.put("Kholi", 5000);
		map.put("Dhoni", 20000);
		map.put("Sachin", 8000);
		map.put("Rohit", 4000);
		map.put("Jadeja", 10000);
		
		Set<Entry<String,Integer>> ref = map.entrySet();
		ref.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		System.out.println("==================entries in desc order...");
		ref.stream().sorted((a1,a2) -> a2.getKey().compareTo(a1.getKey())).
		forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		System.out.println("================remove entries...");
		ref.stream().filter(e -> e.getValue() < 10000).collect(Collectors.toList()).
		forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
	}

}
