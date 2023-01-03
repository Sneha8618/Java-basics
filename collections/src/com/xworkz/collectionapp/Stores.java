package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Stores {
	
	public static void main(String[] args) {
		
		Collection<String> store = new ArrayList();
		store.add("Big bazar");
		store.add("D-mart");
		store.add("More");
		store.add("Vishala mart");
		store.add("Meenakshi");
		
		store
		.stream()
		.filter(e -> e.endsWith("t") && e.contains("-"))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("======Another stream...");
		store
		.stream()
		.map(e -> e.toUpperCase())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("=====Another stream...");
		store
		.stream()
		.map(e -> e.toLowerCase())
		.collect(Collectors.toSet())
		.forEach(e -> System.out.println(e));
		
	}

}
