package com.xworkz.collectionapp;

public class AirportDTO {
	
	private String name;
	private String place;
	private Double price;
	
	
    public AirportDTO() {
    	
    }
    
    public AirportDTO(String name, String place, Double id) {
    	this.name = name;
    	this.place = place;
    	this.price = price;
    }
    
    public String toString() {
    	return "Airport - [name - " + this.name + "place - " + this.place + "price - " + this.price + "]";
    }
    
    public boolean equals(Object obj) {
    	
    	if(obj != null) {
    		
    		if(obj instanceof AirportDTO) {
    			
    			AirportDTO dto = (AirportDTO)obj;
    			if(dto.place.equals(this.place)) {
    				return true;
    			}
    			if(dto.name.equals(this.name)) {
    				return true;
    			}
    		}
    	}
    	return false;
    	
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
