package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PincodeRunner {
	
	public static void main(String[] args) {
		
		Map<Long,String> map = new TreeMap();
		map.put(587125L, "Ilkal");
		map.put(587313L, "Mudhol");
		map.put(587143L, "Baglkot");
		map.put(587420L, "Hubli");
		map.put(587567L, "Belgavi");
		map.put(587312L, "Terdal");
		map.put(587225L, "Koppal");
		map.put(587678L, "Dharwad");
		map.put(587987L, "Bilagi");
		map.put(587765L, "Hasan");
		
		System.out.println("=======keys====");
		Set<Long> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		
		System.out.println("======values....");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));
		
		System.out.println("====both keys and values...");
		Set<Entry<Long,String>> entries = map.entrySet();
		
		for(Entry<Long,String> ref : entries) {
			System.out.println(ref.getKey() + " " + ref.getValue());
		}
		
	}

}
