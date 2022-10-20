package com.xworkz.medicalapp.medicalshop;

public class MilkParlour {
	
	public String id;
	public String name;
	public String address;
	public String milkProducts[];
	public int prices[];
	public String brandNames[];
	public int noOfProducts;
	public int noOfWorkers;
	
	public MilkParlour(String id, String name, String address, String milkProducts[], int prices[],
			String brandNames[], int noOfProducts, int noOfWorkers) {
		System.out.println("Milk parlour object is created");
		this.id = id;
		this.name = name;
		this.address = address;
		this.milkProducts = milkProducts;
		this.prices = prices;
		this.brandNames = brandNames;
		this.noOfProducts = noOfProducts;
		this.noOfWorkers = noOfWorkers;
		
	}
	
	public void toMakeProducts() {
		System.out.println("Milk parlour id is" + id);
		System.out.println("*********************");
		System.out.println("Milk parlour name is" + name);
		System.out.println("*********************");
		System.out.println("Milk parlour address is");
		System.out.println("*********************");
		
		System.out.println("List of milk products are");
		for(int i = 0; i < milkProducts.length; i++) {
			System.out.println(milkProducts[i]);	
		}
		System.out.println("*********************");
		System.out.println("Prices of products are");
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		System.out.println("*********************");
		System.out.println("Brand names are");
		for(int i = 0; i < brandNames.length; i++) {
			System.out.println(brandNames[i]);
		}
	}

}
