package com.xworkz.collectionapp;

public class MaskDTO {
	
	private String color;
	private double price;
	
	public MaskDTO() {
		
	}
	
	public MaskDTO(String color, double price) {
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		return "Mask - [color - " +  this.getColor()  + "price - " +  this.getPrice() + "]";
	}
	
	public boolean equals(Object obj) {
		return true;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	

}
