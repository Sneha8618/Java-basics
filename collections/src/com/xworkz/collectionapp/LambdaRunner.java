package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaRunner {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList();
		collection.add("Sneha");
		collection.add("Anu");
		collection.add("Sahana");
		collection.add("Manu");
		collection.add("Muskan");
		collection.add("Swati");
		collection.add("Vishala");
		collection.add("Shubhangi");
		
		/*Consumer<String> consumer = (a2) -> {
			
		};
		collection.forEach();*/
		
		System.out.println("*********Using for-each");
		for(String value : collection) {
			System.out.println(value);
		}
		
		System.out.println("*********Using lambda function");
		collection.forEach((a1) -> {System.out.println(a1);});
		
	}

}
