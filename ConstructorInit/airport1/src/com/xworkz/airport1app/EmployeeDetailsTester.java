package com.xworkz.airport1app;

public class EmployeeDetailsTester {
	
public static void main(String args[]) {
		
		//static members can be shared among multiple objects
		EmployeeDetails.companyName  = "Amazon";
		EmployeeDetails.companyAddress = "Manyata Techpark";
		
		EmployeeDetails emp = new EmployeeDetails("AWS123", "Sneha", "O+" );
		//instance members cannot be shared among multiple objects
		
		System.out.println("Employee details");
		System.out.println(emp.employeeId + " "+ emp.name + " "+ emp.bloodGroup);
		System.out.println(EmployeeDetails.companyName + " "+ EmployeeDetails.companyAddress);
		
		EmployeeDetails emp1 = new EmployeeDetails( "AWS124", "Mahananda", "AB+");
		System.out.println(emp1.employeeId + " "+ emp1.name + " "+ emp1.bloodGroup);
		System.out.println(EmployeeDetails.companyName + " "+ EmployeeDetails.companyAddress);
		
		EmployeeDetails emp2 = new EmployeeDetails("AWS125", "Sneha", "B+");
		
		System.out.println(emp2.employeeId + " "+ emp2.name + " "+ emp2.bloodGroup);
		System.out.println(EmployeeDetails.companyName + " "+ EmployeeDetails.companyAddress);
		
	}

}


