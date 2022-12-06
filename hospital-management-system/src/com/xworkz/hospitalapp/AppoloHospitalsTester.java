package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.appolohospitals.AppoloHospitals;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloHospitalsTester {
	
	

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		
		AppoloHospitals appoloHospitals = new AppoloHospitals(size);
		
		for(int i = 0; i < size; i++) {
			Patient patient = new Patient();
			
			System.out.println("Enter the patient name");
			patient.setPatientName(sc.next());
			
			System.out.println("Enter the patients age");
			patient.setAge(sc.nextInt());
			
			System.out.println("Enetr patient's address");
			patient.setAddress(sc.next());
			
			System.out.println("Enter patient's gender");
			String gender = sc.next();
			patient.setGender(Gender.valueOf(gender));
			
			appoloHospitals.addPatient(patient);
			
		}
		
		
		//appoloHospitals.getAllPatients();
		
		System.out.println("Enter the patient name");
		String patientName = sc.next();
		appoloHospitals.getPatientByName(patientName);
		
		System.out.println("Enter patient age");
		int age = sc.nextInt();
		appoloHospitals.getPatientByAge(age);
		
		System.out.println("Enter patient address");
		String address = sc.next();
		appoloHospitals.getPatientByAddress(address);
		
		System.out.println("Enter patient gender");
		String gender = sc.next();
		appoloHospitals.getPatientByGender(Gender.valueOf(gender));
		
		System.out.println("Enter the patient gender");
		String gender1 = sc.next();
		appoloHospitals.getPatientNameByGender(Gender.valueOf(gender1));
		
		System.out.println("Enter the patient name");
		String name = sc.next();
		appoloHospitals.getGenderByPatientName(name);
		
		
		
		
		
		sc.close();
		
	}

}
