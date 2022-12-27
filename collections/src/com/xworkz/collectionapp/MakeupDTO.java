package com.xworkz.collectionapp;

public class MakeupDTO {
	
	private String name;
	private String brand;
	private double price;
	
	public MakeupDTO() {
		
	}
	
	public MakeupDTO(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Makeup [name - " + this.getName() + "brand - " + this.getBrand() + "price - " + this.getPrice() + "]";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

}
