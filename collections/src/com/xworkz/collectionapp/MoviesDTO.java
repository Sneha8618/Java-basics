package com.xworkz.collectionapp;

import java.io.Serializable;
import java.time.LocalDate;

public class MoviesDTO implements Serializable, Comparable<MoviesDTO>{
	
	private String name;
	private double budget;
	private String language;
	private double price;
	private LocalDate date;
	
	public MoviesDTO() {
		
	}
	
	public MoviesDTO(String name, double budget, String language, double price, LocalDate date) {
		this.name = name;
		this.budget = budget;
		this.language = language;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "MoviesDTO [name=" + name + ", budget=" + budget + ", language=" + language + ", price=" + price
				+ ", date=" + date + "]";
	}
	
	@Override
	public int hashCode() {
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof MoviesDTO) {
				
				MoviesDTO dto = (MoviesDTO)obj;
				if(dto.name.equals(this.name) && dto.language.equals(this.language)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public int compareTo(MoviesDTO o) {
		
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

	
	
	
	

}
