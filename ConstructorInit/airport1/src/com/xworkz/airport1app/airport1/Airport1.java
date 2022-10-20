package com.xworkz.airport1app;

public class Airport1 {
	
    static String name = "BIA";
	public static void main(String args[]) {
		
		System.out.println(Airport1.name);
		Airport1 airport = new Airport1();
		System.out.println(airport.name);
		airport.name = "Mumbai Airport";
		System.out.println(airport.name);
		
		int airportId = 0;
		System.out.println(airportId);
	}

}
