package com.xworkz.collectionapp;

public class MarketTester {
	
	public static void main(String[] args) {
		
		Market market = new MarketImpl();
		market.buyItems(101, "Bresh");
		
		
		//ananymous function
		Market market1 = new Market() {

			@Override
			public void buyItems(int id, String name) {
				System.out.println("Running ananymous function");
				System.out.println(id);
				System.out.println(name);
			}
		};
		market1.buyItems(102, "Powder");
		
		//lambda function
		Market lambda = (a1, a2) -> {
			System.out.println("Running buy items in lambda");
			System.out.println(a1);
			System.out.println(a2);
		};
		lambda.buyItems(103, "Soap");
	}
	
	
	

}
