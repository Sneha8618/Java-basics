package com.xworkz.medicalapp.medicalshop;

public class TeaStall {
	
	public int stallId;
	public String stallName;
	public String ownerName;
	
	{
		//It is a instance block in java
		//two types of blocks - instance and static block
	}
	
	static {
		//it is a static block
	}
	
	public TeaStall() {
		
	}
	//to invoke the members of class or call the members of a class
	public TeaStall(int id, String stallName, String ownerName) {
		
		System.out.println("Tea stall object is created");
		
		//write id , using this is optional
		//stallId = id;
		this.stallId = id;
		
		//write name, ownerName , this keyword is to avoid naming conflict between the parameter and instance variable
		this.stallName= stallName;
		this.ownerName = ownerName;
		
		//invoking displayInfo method in a constructor using this keyword
		this.displayInfo();
		
		
	}
	
	public void displayInfo() {
		
		//invoking variables of a current class using this keyword
		System.out.println(this.stallId + " "+ this.stallName + " "+ this.ownerName);
	}
	
	

}
