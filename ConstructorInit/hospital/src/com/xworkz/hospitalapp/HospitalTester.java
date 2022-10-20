package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	
    public static void main(String args[]) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Ganesha");
		hospital.savePatientNames("Ganeshi");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("Dasappa");
		hospital.savePatientNames("Yellamma");
		hospital.getPatientNames();
		
		hospital.updatePatientNames("Guna", "Guna Sarkar");
		hospital.getPatientNames();
	}

}
