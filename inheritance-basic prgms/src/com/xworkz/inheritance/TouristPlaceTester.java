package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Hampi;
import com.xworkz.inheritance.fruit.TouristPlace;

public class TouristPlaceTester {
	
	public static void main(String args[]) {
		
		TouristPlace plc = new TouristPlace();
		plc.toSeePlaces("Anjanadri bett");
		System.out.println("Tourist place is" + plc.famousPlace);
		
		Hampi plc1 = new Hampi();
		plc1.toSeePlaces("Virupaksh temple");
		System.out.println("In hampi the famous place is" + plc1.famousPlace);
		
	}

}
