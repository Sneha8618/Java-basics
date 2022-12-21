package com.xworkz;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ShoeSize {
	
	public static void main(String args[]) {
		
		int size1 = 8;
		int size2 = 9;
		int size3 = 10;
		int size4 = 12;
		int size5 = 13;
		
		Collection<Integer> size = new LinkedList();
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		
		System.out.println(size);
		
		for(Integer value : size) {
			System.out.println(value);
		}
		
		System.out.println("Accessing values using iterator");
		Iterator<Integer> ref = size.iterator();
		while(ref.hasNext()) {
			Integer values = ref.next();
			System.out.println(values);
		}
	}

}
