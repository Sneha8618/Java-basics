package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SoldierDTO extends AbstractAuditDTO{
	
	@NotNull
	@Size(min = 2 , max = 25, message = "name should be > 2 and < 25")
	private String name;
	@Min(value = 1, message = "id value should be > 1")
	@Max(value = 1000, message = "id value should be < 1000")
	private int id;
	@NotNull
	@Size(min = 3, max = 40, message = "rank should be > 3 and < 40")
	private String rank;
	@NotNull
	@Size(min = 4, max = 50, message = "bettalian should be > 4 and < 50")
	private String betallion;
	@NotNull
	@Size(min = 3, max = 120, message = "country name should be > 3 and < 120")
	private String country;

}
