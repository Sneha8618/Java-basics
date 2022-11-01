package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.CarromBoard;

public class CarromBoardTester {
	
public static void main(String args[]) {
		
		String brand[] = {"SISCAA", "SURCO", "PRICISE", "GSI", "SYNCO"};
	
		CarromBoard car = new CarromBoard(brand);
		
		car.displayInformation();
		
	}

}
