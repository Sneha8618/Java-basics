package com.xworkz.inheritance.fruit;

public class Perfume {
	
	public int price;
	public String fragrant;
	
	public void toGetFreshness(int price) {
		System.out.println("Perfumes are used to get fragrated");
		this.price = price;
	}
	
	public void toGetFragrated(String fragrant) {
		this.fragrant = fragrant;
	}

}
