package com.xworkz.airportapp;

public class Airport {
	
	private String name;
	private String district;
	
	public Airport() {
		System.out.println("Airport constructor is called..");
	}
	
	public void setName(String na) {
		name = na;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDistrict(String dist) {
		district = dist;
	}
	
	public String getDistrict() {
		return district;
	}
	
}
