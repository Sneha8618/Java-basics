package com.xworkz.airport1app;

public class EmployeeDetails {
	
	//default consructor
	public EmployeeDetails() {
		
	}
	
	static public String companyName;
	static public String companyAddress;
	
	public String employeeId;
	public String name;
	public String bloodGroup;
	
	//use of constructor is to init the instance variable of a class
	//parameterised constructor
	public EmployeeDetails(String empId, String nm, String bGroup) {
		
		System.out.println("Employee object is created");
		employeeId = empId;
		name  = nm;
		bloodGroup = bGroup;
		
		//this.employeeId = employeeId;
		//this.name = name;
		//this.bloodGroup = bloodGroup;
	}
	
	public void toHelpOrgToGrow() {
		System.out.println("Naanu naane");
	}

}



