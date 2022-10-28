package com.xworkz.medicalapp.medicalshop;

public class MedicalShop {
	
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicineName[];
	public String cosmetics[];
	public int noOfSections;
	public String billingMethod[];
	
	//this  : It is used to avoid the conflict between instance variable and parameter
	//default constructor
	public MedicalShop() {
		
	}
	
	//parameterized constructor
	public MedicalShop(String gstNo,String address, String name, String staffNames[], long staffContactNo[], String medicineName[], String cosmetics[], int noOfSections, String billingMethod[]) {
		System.out.println("Medical shop object is created");
		this.gstNo = gstNo;
		this.address = address;
		this.name = name;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.medicineName = medicineName;
		this.cosmetics = cosmetics;
		this.noOfSections = noOfSections;
		this.billingMethod = billingMethod;
		
	}
	
	public void displayInfo() {
		System.out.println("Medical shop name is" +name);
		System.out.println("=========================");
		System.out.println("Medical shop gst no is" +gstNo);
		System.out.println("=========================");
		System.out.println("Medical shop address is" +address);
		System.out.println("=========================");
		System.out.println("No of sections are" +noOfSections);
		System.out.println("=========================");
		
		System.out.println("Medical staff info");
		for(int i = 0; i < staffNames.length; i++) {
			System.out.println(staffNames[i]);
		}
		System.out.println("=========================");
		System.out.println("Medical staff contact no");
		for(int i = 0; i < staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]);
		}
		System.out.println("=========================");
		System.out.println("Medicine names are");
		for(int i = 0; i < medicineName.length; i++) {
			System.out.println(medicineName[i]);
		}
		System.out.println("=========================");
		System.out.println("Cosmetics names are");
		for(int i = 0; i < cosmetics.length; i++) {
			System.out.println(cosmetics[i]);
		}
		System.out.println("=========================");
		System.out.println("Billing methods are");
		for(int i =0; i < billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
		}
		
		
		
	}
	

}
