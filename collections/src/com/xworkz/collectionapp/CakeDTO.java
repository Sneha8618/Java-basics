package com.xworkz.collectionapp;

public class CakeDTO {
	
	private String name;
	private double price;
	private String shape;
	private String bakeryName;
	
	public CakeDTO() {
		
	}
	
	public CakeDTO(String name, double price, String shape, String bakeryName) {
		this.name = name;
		this.price = price;
		this.shape = shape;
		this.bakeryName = bakeryName;
	}
	
	public String toString() {
		return "Cake [name - " + this.name + "price - " + this.price + "shape - " + this.shape + 
				        "bakername - " + this.bakeryName + "]";
	}
	
	@Override
	public boolean equals(Object ref) {
		
		if(ref != null) {
			
			if(ref instanceof CakeDTO) {
				
				CakeDTO dto = (CakeDTO)ref;
				if(dto.name.equals(this.name) && dto.bakeryName.equals(this.bakeryName)) {
				   return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 40;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getBakeryName() {
		return bakeryName;
	}

	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	
	
	

}
