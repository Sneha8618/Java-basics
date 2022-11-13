package com.xworkz.inheritance.fruit;

public class Wood {
	
	public String type;
	
	public void toBuild() {
		System.out.println("Wood is a part of tree");
	}
	
	public void toMakeFurnitures(String type) {
		this.type = type;
	}

}
