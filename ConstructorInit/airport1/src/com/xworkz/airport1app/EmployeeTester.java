package com.xworkz.airport1app;

public class EmployeeTester {
	
	public static void main(String args[]) {
		
		//static members can be shared among multiple objects
		Employee.companyName  = "Amazon";
		Employee.companyAddress = "Manyata Techpark";
		
		Employee emp = new Employee();
		//instance members cannot be shared among multiple objects
		emp.employeeId = "AWS123";
		emp.name = "Sneha";
		emp.bloodGroup = "O+";
		System.out.println("Employee details");
		System.out.println(emp.employeeId + " "+ emp.name + " "+ emp.bloodGroup);
		System.out.println(Employee.companyName + " "+ Employee.companyAddress);
		
		Employee emp1 = new Employee();
		emp1.employeeId = "AWS124";
		emp1.name = "Mahananda";
		emp1.bloodGroup = "AB+";
		System.out.println(emp1.employeeId + " "+ emp1.name + " "+ emp1.bloodGroup);
		System.out.println(Employee.companyName + " "+ Employee.companyAddress);
		
		Employee emp2 = new Employee();
		emp2.employeeId = "AWS125";
		emp2.name = "Sneha";
		emp2.bloodGroup = "B+";
		System.out.println(emp2.employeeId + " "+ emp2.name + " "+ emp2.bloodGroup);
		System.out.println(Employee.companyName + " "+ Employee.companyAddress);
		
	}

}
