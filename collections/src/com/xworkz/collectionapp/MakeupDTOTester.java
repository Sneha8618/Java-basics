package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MakeupDTOTester {
	
	public static void main(String[] args) {
		
		MakeupDTO dto1 = new MakeupDTO("Kajal", "Itex", 345D);
		MakeupDTO dto2 = new MakeupDTO("Powder", "Whitetone", 255D);
		MakeupDTO dto3 = new MakeupDTO("Facewash", "Himalaya", 598D);
		
		Collection<MakeupDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		
		//System.out.println(collection);
		
		for(MakeupDTO element : collection) {
			System.out.println(element);
		}
		
		Iterator<MakeupDTO> ref = collection.iterator();
		while(ref.hasNext()) {
			MakeupDTO value = ref.next();
			
			System.out.println("***********************");
			System.out.println(value.getPrice());
			System.out.println(value.getBrand());
			System.out.println(value.getPrice() > 260);
			
			
			System.out.println("***********************");
			if("Itex".equals(value.getBrand())) {
			System.out.println(true);
			
			value.setPrice(645D);
			
			if(value.getPrice() > 550) {
				System.out.println(value);
				ref.remove();
			}
			
			
			
				
			}
		}
	}
		
	}


