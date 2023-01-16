package com.xworkz.collectionapp;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountryAndPresident {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap();
		map.put("India", "NarendrModi");
		map.put("Pakistan", "Shehbaz Sharif");
		map.put("China", "LiKeqiang");
		map.put("Mangolia", "Erden");
		map.put("Argentina", "Luis Manzur");
		map.put("Australia", "AnthonyAlbanese");
		map.put("Bangladesh", "Sheik Hasina");
		map.put("Belgium", "Alexander");
		map.put("Canada", "Justin Trudeau");
		map.put("Egypt", "Madboudly");
		map.put("France", "Elisabeth");
		map.put("Germany", "Olaf Scholz");
		map.put("Iran", "Leo");
		map.put("Kenya", "William");
		map.put("Libya", "Abdul Hamid");
		map.put("Mexico", "Erdene");
		map.put("Nepal", "Dhal");
		map.put("Nigeria", "Mahamadou");
		map.put("Ireland", "Varadkar");
		map.put("Greece", "Mitsotakis");
		
		System.out.println("keys and values in an ascending order....");
		map.forEach((k,v) -> System.out.println("keys: " + k + " values: " + v));
		
		System.out.println("==================Update president name");
		map.forEach((k,v) -> { 
			if(k.length() > 4) {
				map.replace("India", "Mahamohansingh");
				System.out.println(k + " " + v);
			}
		});
		
		System.out.println("=================Update another name");
		map.forEach((k,v) -> {  
		    map.replace("Nepal", "Obama");
		    System.out.println(k + " " + v);
		});
		
		System.out.println("============Keys in desc order");
		Set<Entry<String,String>> ref = map.entrySet();
		//ref.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		ref.stream().sorted((a1,a2) -> a2.getKey().compareTo(a1.getKey())).
		forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		System.out.println("============values in desc order");
		ref.stream().sorted((a1,a2) -> a2.getValue().compareTo(a1.getValue())).
		forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		
	

	}

}
