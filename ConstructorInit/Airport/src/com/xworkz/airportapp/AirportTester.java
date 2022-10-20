package com.xworkz.airportapp;

public class AirportTester {
	
	public static void main(String args[]) {
		
		Airport airp = new Airport();
		airp.setName("Kempegouda International Airport");
		airp.setDistrict("Bangalore");
		
		System.out.println(airp.getName() + " "+ airp.getDistrict());
		
		
		
	}

}
