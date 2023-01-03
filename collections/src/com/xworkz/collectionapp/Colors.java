package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Colors {
	
	public static void main(String[] args) {
		
		Collection<String> color = new ArrayList();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Black");
		color.add("Orange");
		color.add("White");
		color.add("Pink");
		
		color
		.stream()
		.filter(e -> e.endsWith("e"))
		.filter(e -> e.contains("r"))
		.map(e -> e.toLowerCase())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("========another stream....");
		color
		.stream()
		.map(e -> e.charAt(0))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("=======another stream.....");
		color
		.stream()
		.filter(e -> e.startsWith("B"))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
	}

}
