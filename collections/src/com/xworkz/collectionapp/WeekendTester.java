package com.xworkz.collectionapp;

public class WeekendTester {
	
	public static void main(String[] args) {
		
		Weekend weekend = (a1) -> {
			System.out.println("Running test method in lambda function ");
			System.out.println(a1);
		};
		weekend.test("last");
	}

}
