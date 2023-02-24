package com.xworkz.festivalDatabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "festival")
@NamedQuery(name = "findByIdAndName", query = "select entity from FestivalEntity entity where entity.id = 3 and entity.name = 'Shivaratri'")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select entity from FestivalEntity entity where entity.name = 'RaskhaBandhan' and entity.region = 'Rajsthan' and entity.mainGod = 'Anna'")
@NamedQuery(name = "findByMainGod", query = "select entity from FestivalEntity entity where entity.mainGod = :by")
@NamedQuery(name = "findTotalDaysByName", query = "select entity.totalDays from FestivalEntity entity where entity.name = :nm ")
@NamedQuery(name = "findRegionAndMainGodByNameAndId", query = "select entity.region, entity.mainGod from FestivalEntity entity where entity.name = :nm and entity.id = :i")
@NamedQuery(name = "findMainGodAndTotalDaysByName", query = "select entity.mainGod, entity.totalDays from FestivalEntity entity where entity.name = :nm")
@NamedQuery(name = "findTotal", query = "select count(entity) from FestivalEntity entity")
@NamedQuery(name = "findMaxTotalDays", query = "select max(entity.totalDays) from FestivalEntity entity")

public class FestivalEntity {
	
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_total_days")
	private int totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_main_god")
	private String mainGod;
	
	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
