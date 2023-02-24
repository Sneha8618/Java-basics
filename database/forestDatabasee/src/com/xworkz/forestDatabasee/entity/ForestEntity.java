package com.xworkz.forestDatabasee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "forest")
@NamedQuery(name = "findAreaByName", query = "select entity.f_area from ForestEntity entity where entity.f_name = 'amazon'")
@NamedQuery(name = "findByName", query = "select entity from ForestEntity entity where entity.f_name = 'Giri NationalPark'")
@NamedQuery(name = "findByNameAndState", query = "select entity from ForestEntity entity where entity.f_name = 'Mangroves' and entity.f_state = 'Maharastra'")
@NamedQuery(name = "findByNameAndStateAndArea", query = "select entity from ForestEntity entity where entity.f_name = 'Sundarbans' and entity.f_state = 'Tamilnadu' and entity.f_area = 478D")
@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity where entity.f_state = 'Kashmir'")
@NamedQuery(name = "findCount", query = "select count(entity) from ForestEntity entity")
@NamedQuery(name = "findMaxArea", query = "select max(entity.f_area) from ForestEntity entity")
@NamedQuery(name = "findNameById", query = "select entity.f_name from ForestEntity entity where entity.f_id = 4 ")
@NamedQuery(name = "findStateByNameAndArea", query = "select entity.f_state from ForestEntity entity where entity.f_name = 'Kukrail' and entity.f_area = 333D ")

public class ForestEntity {
	
	@Id
	@Column(name = "f_id")
	private int f_id;
	@Column(name = "f_name")
	private String f_name;
	@Column(name = "f_state")
	private String f_state;
	@Column(name = "f_type")
	private String f_type;
	@Column(name = "f_area")
	private Double f_area;
	
	
	

}
