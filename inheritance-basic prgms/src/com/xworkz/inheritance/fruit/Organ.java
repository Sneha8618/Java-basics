package com.xworkz.inheritance.fruit;

public class Organ {
	
	public String purpose;
	
	public void toServive() {
		System.out.println("Organs are pillars of our body");
	}
	
	public void forDifferentActivities(String purpose) {
		this.purpose = purpose;
		
	}

}
