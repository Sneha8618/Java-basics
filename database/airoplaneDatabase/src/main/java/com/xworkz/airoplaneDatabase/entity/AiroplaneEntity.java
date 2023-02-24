package com.xworkz.airoplaneDatabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "airoplane")
@NoArgsConstructor

public class AiroplaneEntity {
	
	@Id
	@Column(name = "a_id")
	private int a_id;
	@Column(name = "a_company")
	private String a_company;
	@Column(name = "a_name")
	private String a_name;
	@Column(name = "a_cost")
	private double a_cost;
	@Column(name = "a_type")
	private String a_types;
	@Column(name = "a_country")
	private String a_country;
	

}
