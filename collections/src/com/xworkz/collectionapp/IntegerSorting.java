package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerSorting {
	
	public static void main(String[] args) {
		
		Collection<Integer> collection = Stream.of(24, 76, 97, 12, 87, 10, 5, 99).collect(Collectors.toList());
		
		collection
		.stream()
		.sorted()
		.forEach(e -> System.out.println(e));
	}

}
