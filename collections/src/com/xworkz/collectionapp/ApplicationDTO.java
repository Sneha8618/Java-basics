package com.xworkz.collectionapp;

public class ApplicationDTO {
	
	private String name;
	private double version;
	private boolean isFree;
	private String developedBy;
	private double price;
	
	public ApplicationDTO() {
		
	}
	
	public ApplicationDTO(String name, double version, boolean isFree, String developedBy, double price) {
		this.name = name;
		this.version = version;
		this.isFree = isFree;
		this.developedBy = developedBy;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", vesion=" + version + ", isFree=" + isFree + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return 35;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVesion() {
		return version;
	}

	public void setVesion(double vesion) {
		this.version = vesion;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof ApplicationDTO) {
				
				ApplicationDTO dto = (ApplicationDTO)obj;
				if(dto.name.equals(this.name) && dto.developedBy.equals(this.developedBy)) {
					return true;
				}
			}
		}
		return false;
	}
	

}
