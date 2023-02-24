package com.xworkz.airoplaneDatabase.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AiroplaneDTO {
	
	@Size(min = 3, max = 20, message = "company should be greaterthan 3 or lessthan 20")
	private String company;
	@Size(min = 3, max = 20, message = "name should be greaterthan 3 or lessthan 20")
	private String name;
	private Double cost;
	@Size(min = 3, max = 20, message = "type should be greaterthan 3 or lessthan 20")
	private String types;
	@Size(min = 3, max = 20, message = "country should be greaterthan 3 or lessthan 20")
	private String country;
	
	public AiroplaneDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	

}
