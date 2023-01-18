package com.xworkz.springpframework.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor



public class TerroristDTO extends AbstractAuditDTO{
	
	@NotNull
	@Size(min = 3, max = 20, message = "Name is invalid, should be more than 3 and less than 20")
	private String name;
	@Max(value = 100, message = "Age should be greaterthan 1 or less than 150")
	@Min(value = 1, message = "Age should be greaterthan 1 or less than 150")
	private int age;
	@NotNull
	@Size(min = 5, max = 50, message = "country name should be > 5 and <50")
	private String country;
	private boolean isAlive;
	private boolean prison;
	@NotNull
	@Size(min = 6, max = 40, message = "specialization name should be > 6 and < 40")
	private String specialization;
	@NotNull
	@Size(min = 5, max = 45, message = "organization should be > 5 and < 45")
	private String organization;
	
	
	
	

}
