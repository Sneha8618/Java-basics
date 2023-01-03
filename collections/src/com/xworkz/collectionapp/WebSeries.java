package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class WebSeries {
	
	public static void main(String[] args) {
		
		Collection<String> webSeries = new ArrayList();
		webSeries.add("Gattimela");
		webSeries.add("Wednesday");
		webSeries.add("Geetha");
		webSeries.add("Honeymoon");
		webSeries.add("Just married");
		webSeries.add("Gattimela");
		webSeries.add("Honganasu");
		
		System.out.println("==========Using another temp collection");
		Collection<String> temp = new ArrayList();
		for(String value : webSeries) {
			if(value.endsWith("a")) {
				System.out.println(value);
				temp.add(value);
			}
		}
		System.out.println("Sizeof temp collection : " + temp.size());
		
		 System.out.println("=========Using streams");
		 webSeries
		.stream()
		.filter(e -> e.endsWith("a"))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		 
		 System.out.println("==========Another stream........");
		 webSeries
		 .stream()
		 .map((e) -> {
			 if(e.length() > 10) 
		        return e;
			    return "NA";})
		 .collect(Collectors.toList())
		 .forEach(e -> System.out.println(e));
		 
		 System.out.println("=======Another stream.....");
		 webSeries
		 .stream()
		 .filter((e)-> { return e.startsWith("H");})//another way
		 .map(e -> e.toUpperCase())
		 .collect(Collectors.toList())
		 .forEach(e -> System.out.println(e));
		 
		 

		 
		
	}

}
