package com.xworkz.inheritance.fruit;

public class Laptop {
	
	public String processorType;
	public int price;
	
	public void toStoreData(String processorType) {
	   System.out.println("it is a electronic device");
	   this.processorType = processorType;
   }
	
	public void gamingPurpose(int price) {
		this.price = price;
	}
}


 
