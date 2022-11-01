package com.xworkz.overloading.conceptoverloading;

public class PetrolBunk {
    
	//instance variables/ states/ properties/ fields
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];
	
	public PetrolBunk() {
		System.out.println("Default constructor is called");
	}
	
	//default constructor
	public PetrolBunk(String workersName[]) {
		
		this(123,"DeveGowda petrol bunk", "Banshankari 2nd stage", workersName);
		System.out.println("One parameterized constructor");
	}
	
	//parameterized constructor
	public PetrolBunk(int id, String name, String location, String[] workersName) {
		
		//this method - help us to constructor chaining
		this();
		System.out.println("Calling 4 parameterized constructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.workersName = workersName;
		
	}
	
	public void provideFuels() {
		
	}
	
	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " "+ this.name + " "+ this.location);
		System.out.println("List of workers for " + this.name);
		for(int i = 0; i < workersName.length; i++) {
			System.out.println(workersName[i]);
		}
	}
	
	
	


}
