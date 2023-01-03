package com.xworkz.collectionapp;

import java.util.LinkedHashSet;
import java.util.Set;

public class CakeDTOTester {
	
	public static void main(String[] args) {
		
		CakeDTO dto1 = new CakeDTO("Black forest", 250D, "Square", "Ayodhya");
		CakeDTO dto2 = new CakeDTO("Honey", 200D, "Heart", "Ayyangar");
		CakeDTO dto3 = new CakeDTO("Redvelvet", 400D, "Circle", "Kaamat");
		CakeDTO dto4 = new CakeDTO("Honey", 200D, "Heart", "Ayyangar");
		
		Set<CakeDTO> set = new LinkedHashSet();
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);
		set.add(dto4);
		
		for(CakeDTO ref : set) {
			System.out.println(ref);
			System.out.println("Overriden hash code " + ref.hashCode());
			System.out.println("Original hash code " + System.identityHashCode(ref));
		}
	}

}
