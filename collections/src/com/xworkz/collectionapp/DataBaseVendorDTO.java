package com.xworkz.collectionapp;

public class DataBaseVendorDTO {
	
	private String name;
	private String developedBy;
	private Type type;
	private int size;
	private double licenseCost;
	
	public DataBaseVendorDTO() {
		
	}
	
	public DataBaseVendorDTO(String name, String developedBy, Type type, int size, double licenseCost) {
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}
	
	@Override
	public int hashCode() {
		return 45;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof DataBaseVendorDTO) {
				
				DataBaseVendorDTO dto = (DataBaseVendorDTO)obj;
				if(dto.name.equals(this.name) && dto.developedBy.equals(this.developedBy)) {
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

	
	
	

}
