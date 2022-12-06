package com.xworkz.hospitalapp.appolohospitals;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloHospitals extends Hospital {
	
	//One to many
	public Patient[] patients;
	int index;
	
	public AppoloHospitals() {
		
	}
	
	//to add the size in tester we add variable in constructor
	public AppoloHospitals(int size) {
		patients = new Patient[size];	
	}
	
	public boolean addPatient(Patient patient) {
		boolean isPatientAdded = false;
		if(patient != null) {
			System.out.println("Patient's details are right go ahead");	
			patients[index++] = patient;
			isPatientAdded = true;
			//index++;
		}
		return isPatientAdded;
	}
	
	public void getAllPatients() {
		System.out.println("List of all the patinet names");
		for(int i  = 0; i < patients.length; i++) {
			System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
		                       patients[i].getGender());		
		}
	}
	
	public void getPatientByName(String patientName) {
		System.out.println("inside getPatientByName");
		System.out.println("No of parameters : 1 : patientName(String)");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
	                       patients[i].getGender());		
			}
			else {
				System.out.println("No patient information found");
			}
		}
		
	}
	
	public void getPatientByAge(int age) {
		System.out.println("inside getPatientByAge");
		System.out.println("NO of parameters : 1 : pateintAge(int)");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getAge() == age) {
				System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
	                       patients[i].getGender());		
			}
			else {
				System.out.println("No patient information found");
			}
		}
		
	}
	
	public void getPatientByAddress(String address) {
		System.out.println("inside getPatientByAddress ");
		System.out.println("NO of parameters : 1 : pateintAddress(String)");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
	                       patients[i].getGender());
			}
			else {
				System.out.println("No patient information found");
			}
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("inside getPatientByGender ");
		System.out.println("NO of parameters : 1 : pateintGender(Gender)");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName() +" "+ patients[i].getAddress() + " "+ patients[i].getAge() + " "+ 
	                       patients[i].getGender());
			}
			else {
				System.out.println("No patient information found");
			}
		}
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("inside getPatientNameByGender ");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName());
			}
		}
	}
	
	public void getGenderByPatientName(String name) {
		System.out.println("inside getGenderByPatientName");
		for(int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(name)) {
				System.out.println(patients[i].getGender());
			}
		}
	}

}

//getPatiemtByAge(int age)
//getPatientByAddress(String address)
//getPatientByGender(Gender gender)
//getGenderByPatientName(String patientName)
//getPatientNameByGender(Gender gender)