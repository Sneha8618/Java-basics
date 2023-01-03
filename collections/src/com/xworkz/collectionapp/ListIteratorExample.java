package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);
		list.add(100);
		list.add(120);
		
		System.out.println("Access the values in forward direction");
		ListIterator<Integer> itr1 = list.listIterator(2);
		while(itr1.hasNext()) {
			Integer values = itr1.next();
			System.out.println(values);
		}
		
		System.out.println("Access the list values in backward direction");
		ListIterator<Integer> itr = list.listIterator(4);
		while(itr.hasPrevious()) {
			Integer value = itr.previous();
			System.out.println(value);
		}
	}

}
