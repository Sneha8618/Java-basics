package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.TeaStall;

public class TeaStallTester {
	
	public static void main(String args[]) {
		
		
		TeaStall ref = new TeaStall();
		ref.stallId = 1;
		ref.stallName = "Chaiwala";
		ref.ownerName = "Aakash";
		
		System.out.println(ref.stallId + " "+ ref.stallName + " "+ ref.ownerName);
		
		TeaStall ref2 = new TeaStall(2 , "Ganesh tea stall", "Ganesh");
		
		//System.out.println(ref2.stallId + " "+ ref2.stallName + " "+ ref2.ownerName);
	}

}
