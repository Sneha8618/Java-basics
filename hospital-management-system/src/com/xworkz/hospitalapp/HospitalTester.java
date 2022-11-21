package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
		
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the patient name");
			String patientName  = sc.next();
			System.out.println("Enter the patients address");
			String address = sc.next();
			System.out.println("Enter the patients age");
			int age = sc.nextInt();
			
			Patient patient = new Patient(patientName, address, Gender.male, age);
			System.out.println(patient.gender);
			Hospital hos = new Hospital();
			hos.isEmergency = true;
			hos.isTreatmentRequired = true;
			boolean isAdmitted = hos.admit(patient);
			System.out.println("Its emergency" +isAdmitted);
			System.out.println("Patient allowed to admit is " +isAdmitted);
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter next patient name");
			String patientName1 = sc1.next();
			System.out.println("Enter patient address");
			String address1 = sc1.next();
			System.out.println("Enter patients age");
			int age1 =  sc1.nextInt();
			
			Patient patient1 = new Patient(patientName1, address1, Gender.female, age1);
			System.out.println(patient.gender);
			Hospital hos1 = new Hospital();
			hos1.isEmergency = false;
			hos1.isTreatmentRequired = true;
			boolean isAdmitte = hos1.admit(patient1);
			System.out.println("Its emergency" +isAdmitte);
			System.out.println("Patient allowed to admit is " +isAdmitte);
			
			sc.close();
			sc1.close();
		}

	}

	
	


