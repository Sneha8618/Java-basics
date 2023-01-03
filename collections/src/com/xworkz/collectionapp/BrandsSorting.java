package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BrandsSorting {
	
	public static void main(String[] args) {
		
		Collection<String> collection = Stream.of("Ramraj", "MI", "Cottoncandy", "Quartz", "Max", "Luies", "Oppo" )
				                      .collect(Collectors.toList());
		
		 collection
		.stream()
		.sorted()
		.forEach(e -> System.out.println(e));
	}

}
