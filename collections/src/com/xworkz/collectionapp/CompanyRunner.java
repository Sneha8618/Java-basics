package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyRunner {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap();
		map.put("TCS", "Systemsoftware");
		map.put("Wipro", "Applicatinsoftware");
		map.put("Infosys", "UtilitySoftware");
		map.put("Capgemini", "Applicationsoftware");
		map.put("Cognizant", "Systemsoftware");
		map.put("FirstAmerica", "Utilitysoftware");
		map.put("Atos", "Applicationsoftware");
		map.put("Bosch", "Utilitysoftware");
		map.put("Signoff", "Systemsoftware");
		map.put("HCL", "Systemsoftware");
		
		System.out.println("=======keys.....");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		
		System.out.println("=======values.....");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));
		
		System.out.println("=======both keys and values....");
		Set<Entry<String,String>> entries = map.entrySet();
		
		for(Entry<String,String> ref : entries) {
			System.out.println(ref.getKey() + " " + ref.getValue());
		}
		
	} 

}
