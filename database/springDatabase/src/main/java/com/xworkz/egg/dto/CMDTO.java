package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Data
public class CMDTO {
	
	@NotNull(message = "Cm name cannot be blank or null")
	@Size(min = 3, max = 20, message = "Cm name should be greater than 3 and less than 20")
	private String name;
	@NotBlank(message = "Party cannot be null")
	private String party;
	@NotBlank(message = "State cannot be null")
	private String state;
	@NotNull(message = "Tenure cannot be null")
	@Min(value = 1, message = "Tenure cannot be less than 0")
	private Integer tenure;
	@NotNull(message = "Portfolio cannot be null")
	@Size(min = 3, max = 30, message = "Portfolio should be greater than 3 and lessthan 30")
	private String portfolio;
	
	public CMDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	

}
