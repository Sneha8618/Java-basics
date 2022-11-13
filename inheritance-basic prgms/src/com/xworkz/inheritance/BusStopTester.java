package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Mejestic;
import com.xworkz.inheritance.fruit.BusStop;

public class BusStopTester {
	
	public static void main(String args[]) {
		
		BusStop bs = new BusStop();
		bs.toTravel(50);
		System.out.println("Bus ticket amount is.."+bs.ticket);
		
		Mejestic mj = new Mejestic();
		mj.toTravel(30);
		System.out.println("Majestic bus ticket amount is.."+ mj.ticket);
		}

}
