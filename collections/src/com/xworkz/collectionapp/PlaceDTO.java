package com.xworkz.collectionapp;

public class PlaceDTO {
	
	private String name;
	private String famousPlace;
	private Integer noOfTaluks;
	
	public PlaceDTO() {
		
	}
	
	public PlaceDTO(String name, String famousPlace, Integer noOfTaluks) {
		this.name= name;
		this.famousPlace = famousPlace;
		this.noOfTaluks = noOfTaluks;
	}
	
	@Override
	public String toString() {
		return "Place - [name - " + this.name + "famousPlace - " + this.famousPlace + "noOfTaluks - " + 
	                                        this.noOfTaluks + "]";
	}
	
	@Override
	public boolean equals(Object ref) {
		
		if(ref != null) {
			
			if(ref instanceof PlaceDTO) {
				
				PlaceDTO dto = (PlaceDTO)ref;
				if(dto.name.equals(this.name)) {
					return true;
				}
				if(dto.famousPlace.equals(this.famousPlace)) {
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

	public String getFamousPlace() {
		return famousPlace;
	}

	public void setFamousPlace(String famousPlace) {
		this.famousPlace = famousPlace;
	}

	public Integer getNoOfTaluks() {
		return noOfTaluks;
	}

	public void setNoOfTaluks(Integer noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}
	
	
	
	

}
