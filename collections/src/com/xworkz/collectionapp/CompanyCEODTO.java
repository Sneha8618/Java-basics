package com.xworkz.collectionapp;

public class CompanyCEODTO {
	
	private String name;
	private int age;
	private String company;
	private String country;
	private String qualification;
	private boolean married;
	private DaughterDTO dto;
	
	public CompanyCEODTO() {
		
	}
	
	public CompanyCEODTO(String name, int age, String company, String country, String qualification, boolean married, DaughterDTO dto) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", age=" + age + ", company=" + company + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + "]";
	}
	
	@Override 
	public int hashCode() {
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof CompanyCEODTO) {
				
				CompanyCEODTO ref = (CompanyCEODTO)obj;
				if(ref.name.equals(this.name) && ref.country.equals(this.country)) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDTO getDto() {
		return dto;
	}

	public void setDto(DaughterDTO dto) {
		this.dto = dto;
	}
	

}
