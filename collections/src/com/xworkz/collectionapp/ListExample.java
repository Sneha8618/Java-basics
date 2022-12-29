package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		
		list.add(0, 1);
		for(Integer value : list) {
			System.out.println(value);
		}
		
		System.out.println("****************After adding");
		list.add(1, 3);
		list.add(2, 5);
		list.add(3, 7);
		for(Integer value : list) {
			System.out.println(value);
		}
		
		System.out.println("*****************After updating");
		list.set(4, 9);
		list.set(5, 11);
		list.set(6, 13);
		for(Integer value : list) {
			System.out.println(value);
		}
		
		System.out.println("***************After removing");
		list.remove(7);
		for(Integer value : list) {
			System.out.println(value);
		}
		
		//String example
		
		List<String> list1 = new ArrayList();
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("G");
		list1.add("I");
		
		System.out.println("****************After adding");
		list1.add(1, "B");
		list1.add(3, "D");
		list1.add(5, "F");
		list1.add(7, "H");
		for(String string : list1) {
			System.out.println(string);
		}
		
		System.out.println("****************After adding");
		list1.set(1, "Z");
		list1.set(3, "Y");
		list1.set(5, "X");
		for(String string : list1) {
			System.out.println(string);
		}
		
		System.out.println("****************After removing");
		list1.remove("Z");
		list1.remove(3);
		for(String string : list1) {
			System.out.println(string);
		}
	}

}
