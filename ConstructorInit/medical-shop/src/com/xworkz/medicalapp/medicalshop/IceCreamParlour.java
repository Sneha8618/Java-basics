package com.xworkz.medicalapp.medicalshop;

public class IceCreamParlour {
	
	public String gstNo;
	public String name;
	public String brandNames[];
	public String flavours[];
	public String typesOfIceCreams[];
	public int prices[];
	public String address;
	public int noOfFlavours;
	
	public IceCreamParlour() {
		
	}
	
	public IceCreamParlour(String gstNo, String name, String brandNames[], String flavours[], 
			String typesOfIceCreams[], int prices[], String address, int noOfFlavours) {
		System.out.println("Ice cream parlour object is created");
		this.gstNo = gstNo;
		this.name = name;
		this.brandNames = brandNames;
		this.flavours = flavours;
		this.typesOfIceCreams = typesOfIceCreams;
		this.prices = prices;
		this.address = address;
		this.noOfFlavours = noOfFlavours;
	}
	
	public void toGetEnjoy() {
		
		System.out.println("Parlour id is" + gstNo);
		System.out.println("*******************");
		System.out.println("Parlour name is" + name);
		System.out.println("*********************");
		System.out.println("Parlour address is" + address);
		System.out.println("*******************");
		System.out.println("No of flavours are" + noOfFlavours);
		System.out.println("*********************");
		
		System.out.println("Ice cream brand names are");
		for(int i = 0; i < brandNames.length; i++ ) {
		  System.out.println(brandNames[i]);
	    }
		System.out.println("*********************");
		System.out.println("Flavours are");
		for(int i = 0; i < flavours.length; i++) {
			System.out.println(flavours[i]);
		}
		System.out.println("*********************");
		System.out.println("Types of IceCreams are");
		for(int i = 0; i < typesOfIceCreams.length; i++) {
			System.out.println(typesOfIceCreams[i]);
		}
		System.out.println("*********************");
		System.out.println("Prices are");
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
	

     }
	
}
