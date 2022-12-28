package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceDTOTester {
	
	public static void main(String[] args) {
		
		PlaceDTO dto1 = new PlaceDTO("Baglkot", "Musium", 6);
		PlaceDTO dto2 = new PlaceDTO("Belgavi", "Falls", 8);
		PlaceDTO dto3 = new PlaceDTO("Hubli", "Garden", 10);
		PlaceDTO dto4 = new PlaceDTO("Vijaypur", "Gumbaj", 9);
		PlaceDTO dto5 = new PlaceDTO("Hubli", null, 15);
		
		Collection<PlaceDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto3);
		System.out.println("contain or not : " + contain);
		
		boolean equals = dto3.equals(dto5);
		System.out.println("equal or not : " + equals);
		
	
	}

}
