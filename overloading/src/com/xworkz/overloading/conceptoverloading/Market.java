package com.xworkz.overloading.conceptoverloading;

public class Market {
	
	public int id;
	public String name;
	public String location;
	public String vegetables[] = new String[6];
	
	
	public Market() {
		System.out.println("Default constructor is called");
	}
	
	public Market(String vegetables[]) {
		 this(342, "Banashankari market", "BTM", vegetables);
		 System.out.println("One default constructor is called");
		
	}
	
	public Market(int id, String name, String location, String[] vegetables) {
		this();
		System.out.println("Parameterized constructor is called");
		this.id = id;
		this.name = name;
		this.location = location;
		this.vegetables = vegetables;
     }
	
	public void getVegetables() {
		
	}

	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " "+ this.name + " "+ this.location);
		for(int i = 0; i < vegetables.length; i++) {
			System.out.println(vegetables[i]);
		}
		
	}
}
