package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "valentine")

public class ValentineEntity {
	
	@Id
	@Column(name = "v_id")
	private int v_id;
	@Column(name = "v_name")
	private String v_name;
	@Column(name = "v_valentine_name")
	private String v_valentine_name;
	@Column(name = "v_places")
	private String v_places;
	@Column(name = "v_gifts")
	private String v_gifts;
	

}
