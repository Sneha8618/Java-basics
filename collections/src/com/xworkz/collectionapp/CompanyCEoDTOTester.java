package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CompanyCEoDTOTester {
	
	public static void main(String[] args) {
		
	
	
	  DaughterDTO dto1 = new DaughterDTO("Sneha", 8618461535L,  22, true, true);
	  DaughterDTO dto2 = new DaughterDTO("Swapna", 9353212141L,  21, false, true);
	  DaughterDTO dto3 = new DaughterDTO("Manu", 6360905588L,  23, false, true);
	  DaughterDTO dto4 = new DaughterDTO("Anu", 9945820639L,  25, true, true);
	  DaughterDTO dto5 = new DaughterDTO("Vishala", 675782732909L,  28, false, true);
	  
	  
	Collection<CompanyCEODTO> collection = new ArrayList();
	collection.add(new CompanyCEODTO("Sudhamurty", 60, "Infosys", "India", "B.E", true, dto1)) ;
    collection.add(new CompanyCEODTO("Ratan Tata", 50, "TCS", "India", "M.tech", true, dto2));
    collection.add(new CompanyCEODTO("Julie sweet", 45, "Accenture", "Japan", "BCA", false, dto3));
    collection.add(new CompanyCEODTO("Andy jessy", 55, "Amazon", "US", "B.E", false, dto4));
    collection.add(new CompanyCEODTO("Sudhamurty", 30, "Infosys", "India", "B.E", true, dto5));
			
	 System.out.println("age is gretare than 30.....");
	 collection
	.stream()
	.map(e -> {
		if(e.getAge() > 30)
			return e;
		return "NA";})
	.collect(Collectors.toList())
	.forEach(e -> System.out.println(e));
	 
	 System.out.println("Daughters name......");
	 collection
	 .stream()
	 .map(e -> e.getDto().getName())
	 .collect(Collectors.toList())
	 .forEach(e -> System.out.println(e));
	 
	 System.out.println("Daughhters age...");
	 collection
	 .stream()
	 .map(e -> e.getDto().getAge())
	 .collect(Collectors.toList())
	 .forEach(e -> System.out.println(e));
	 
	 System.out.println("CEO's age....");
	 collection
	 .stream()
	 .map(e -> e.getAge())
	 .collect(Collectors.toList())
	 .forEach(e -> System.out.println(e));
			
	 System.out.println("Companynames......");
	 collection
	 .stream()
	 .map(e -> e.getCompany())
	 .collect(Collectors.toList())
	 .forEach(e -> System.out.println(e));
	}
}
