package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Age {
	
	public static void main(String[] args) {
		
		Collection<Integer> personsAge = new ArrayList();
		personsAge.add(24);
		personsAge.add(23);
		personsAge.add(25);
		personsAge.add(4);
		personsAge.add(8);
		
		Collection<Integer> dogsAge = new ArrayList();
		//dogsAge.add(27);
		dogsAge.add(4);
		dogsAge.add(8);
		
		boolean contain = personsAge.containsAll(dogsAge);
			System.out.println(contain);
		
		System.out.println("***************************");
		boolean removed = personsAge.removeAll(dogsAge);
		System.out.println(removed);
		
		System.out.println(personsAge.size());
			
		}
	}

		
		/*Collection<Integer> collection = new ArrayList();
		collection.addAll(personsAge);
		collection.addAll(dogsAge);*/
		
		/*Iterator<Integer> element = collection.iterator();
		while(element.hasNext()) {
			Integer ref = element.next();
			System.out.println(ref);
			
			
			}*/
		
	


