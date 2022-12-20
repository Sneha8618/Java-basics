package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {

	public static void main(String args[]) {
		
		String bike1 = "Honda";
		String bike2 = "Pulsar";
		String bike3 = "Royal Enfield";
		String bike4 = "Yamaha";
		String bike5 = "TVS";
		String bike6 = "Hero splendor";
		String bike7 = "KTM";
		String bike8 = "TVS Apache";
		String bike9 = "Activa";
		String bike10 = "Aprilla";
		String bike11 = "Nova";
		String bike12 = "Patriot";
		String bike13 = "Panther";
		String bike14 = "Forger";
		String bike15 = "Ducati";
		String bike16 = "Pegasus";
		String bike17 = "Phoenix";
		String bike18 = "Siren";
		
		Collection<String> bikes = new TreeSet();
		bikes.add(bike1);
		bikes.add(bike2);
		bikes.add(bike3);
		bikes.add(bike4);
		bikes.add(bike5);
		bikes.add(bike6);
		bikes.add(bike7);
		bikes.add(bike8);
		bikes.add(bike9);
		bikes.add(bike10);
		bikes.add(bike11);
		bikes.add(bike12);
		bikes.add(bike13);
		bikes.add(bike14);
		bikes.add(bike15);
		bikes.add(bike16);
		bikes.add(bike17);
		bikes.add(bike18);
		
		System.out.println(bikes.size());
		bikes.clear();
		System.out.println(bikes.size());
	}
}
