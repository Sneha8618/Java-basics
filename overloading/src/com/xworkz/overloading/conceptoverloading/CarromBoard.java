package com.xworkz.overloading.conceptoverloading;

public class CarromBoard {
	
	public int id;
	public int coins;
	public String material;
	public String brand[] = new String[4];
	
	
	public CarromBoard() {
		System.out.println("Default constructor is called");
	}
	
	public CarromBoard(String brand[]) {
		 this(150, 20, "Wood", brand);
		 System.out.println("One default constructor is called");
		
	}
	
	public CarromBoard(int id, int coins, String material, String[] brand) {
		this();
		System.out.println("Calling 4 Parameterized constructor is created");
		this.id = id;
		this.coins = coins;
		this.material = material;
		this.brand = brand;
     }
	
	public void getEntertainment() {
		
	}

	public void displayInformation() {
		System.out.println("displayInformation() is invoked");
		System.out.println(this.id + " "+ this.coins + " "+ this.material);
		for(int i = 0; i < brand.length; i++) {
			System.out.println(brand[i]);
		}
		
	}

}
