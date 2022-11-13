package com.xworkz.inheritance.fruit;

public class Fruit {
	
	public int price;
	public String content;
	
	public void toGetHealthier(int price) {
		System.out.println("Fruits are most healthiest things in life");
		this.price = price;
		
	}
	
	public void provideVitamins(String content) {
		System.out.println("Fruits provide more vitamins to our body");
		this.content = content;
		
	} 
	
	

}
