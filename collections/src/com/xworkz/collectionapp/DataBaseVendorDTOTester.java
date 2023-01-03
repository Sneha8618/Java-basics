package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class DataBaseVendorDTOTester {
	public static void main(String[] args) {
		
		DataBaseVendorDTO dto1 = new DataBaseVendorDTO("Insight Interest", "Sneha", Type.Hierarchicaldatabases, 100, 100D);
		DataBaseVendorDTO dto2 = new DataBaseVendorDTO("Data Fuel Analysis", "Sahana", Type.Networkdatabases, 200, 50D);
		DataBaseVendorDTO dto3 = new DataBaseVendorDTO("Methods Analytics", "Anu", Type.SQL, 150, 70D);
		DataBaseVendorDTO dto4 = new DataBaseVendorDTO("Inbound Database", "Muskan", Type.Objectoriented, 180, 90D);
		DataBaseVendorDTO dto5 = new DataBaseVendorDTO("Analytic Rails", "Manu", Type.Networkdatabases, 250, 110D);
		
		Collection<DataBaseVendorDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		collection
		.stream()
		.map(e -> e.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("=====another stream...");
		collection
		.stream()
		.map(e -> { return e; })
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("=====another stream...");
		collection
		.stream()
		.map((e) -> {
			if(e.getLicenseCost() < 100D || e.getType().equals("SQL") )
				return e;
			return "NA"; })
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		
		
	}

}





