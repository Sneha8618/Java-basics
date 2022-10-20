package com.xworkz.bigbazarapp;

public class BigBazarTester {
	
	public static void main(String args[]) {
		
		BigBazar big = new BigBazar();
		big.branch = "JP nagar";
		big.noOfWorkers = 200;
		big.id = "AS1234578";
		System.out.println(big.branch + " "+ big.noOfWorkers + " "+ big.id);
		
		BigBazar big1 = new BigBazar();
		big1.branch = "Rajajinagar";
		big1.noOfWorkers = 330;
		big1.id = "MS3456798";
		System.out.println(big1.branch + " "+ big1.noOfWorkers + " "+ big1.id);
		
		BigBazar big2 = new BigBazar();
		big2.branch = "Vijaynagar";
		big2.noOfWorkers = 200;
		big2.id = "SN345260";
		System.out.println(big2.branch + " "+ big2.noOfWorkers + " "+ big2.id);
	}

}
