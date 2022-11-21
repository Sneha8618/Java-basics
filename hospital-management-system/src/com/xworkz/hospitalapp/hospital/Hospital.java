package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital extends Object{
	
	public Patient patient ;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted  = false;
		if(isTreatmentRequired == true) {
		if(isEmergency == true) {
			this.patient= patient;
			this.patient.displayInfo();
			isAdmitted=true;
			System.out.println("Patient can be allowed in ICU");
			}
		else {
			System.out.println("Add the patient is general ward");
		}
		}
		else{
			System.out.println("No treatment is required");
		}
		return isAdmitted;
		
	}

}
