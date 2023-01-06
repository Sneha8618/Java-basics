package com.xworkz.collectionapp;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {
	
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private Typee type;
	
	public WeaponDTO() {
		
	}
	
	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, Typee type) {
		this.name= name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof WeaponDTO) {
				
				WeaponDTO dto = (WeaponDTO)obj;
				if(dto.name.equals(this.name) && dto.madeBy.equals(this.madeBy)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return 50;
	}
	
	@Override
	public int compareTo(WeaponDTO o) {
		
		return this.name.compareTo(o.name);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Typee getTypee() {
		return type;
	}

	public void setType(Typee type) {
		this.type = type;
	}

	
	
	
	

}
