package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Patient {
	
	private String patientName;
	private String address;
	private Gender gender;
	private Integer age;
	
	
	/*public Patient(String patientName, String address, Gender gender, int age) {
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
		
		}*/
	
	public void displayInfo() {
		System.out.println("Patient name is " + this.patientName);
		System.out.println("Patient address is " + this.address);
		System.out.println("Patient gender is " + this.gender);
		System.out.println("Patient age is " + this.age);
	}

}
