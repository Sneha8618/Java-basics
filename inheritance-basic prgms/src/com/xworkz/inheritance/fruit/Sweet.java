package com.xworkz.inheritance.fruit;

public class Sweet {
	
	public String ingredient;
	
	public void toMakeSweets() {
		System.out.println("Suagr is a main ingridient to make sweets");
	}
	
	public void toMakeRecipe(String ingredient) {
		this.ingredient = ingredient;
	}

}
