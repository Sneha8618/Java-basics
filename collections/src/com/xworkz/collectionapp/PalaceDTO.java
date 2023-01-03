package com.xworkz.collectionapp;

public class PalaceDTO {
	
	private String name;
	private String location;
	private String builtBy;
	private boolean isDestroyed;
	private int price;
	

	public PalaceDTO(String name, String location, String builtBy, boolean isDestroyed, int price) {
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.isDestroyed = isDestroyed;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", isDestroyed="
				+ isDestroyed + ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		return 50;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		if(ref != null) {
			
			if(ref instanceof PalaceDTO) {
				
				PalaceDTO dto = (PalaceDTO)ref;
				if(dto.name.equals(this.name) && dto.location.equals(this.location)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
