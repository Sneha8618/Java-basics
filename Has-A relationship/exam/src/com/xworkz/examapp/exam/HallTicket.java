package com.xworkz.examapp.exam;

public class HallTicket {
	
	private String candidateName;
	private String subjectNames[];
	private String usnNo;
	private String universityName;
	
	public HallTicket(String candidateName, String subjectNames[], String usnNo, String universityName) {
		this.candidateName= candidateName;
		this.subjectNames = subjectNames;
		this.usnNo = usnNo;
		this.universityName = universityName;
		
	}
	
	public void displayDetails(){
		System.out.println("Candidate Name : " +this.candidateName);
		System.out.println("University Name is: " +this.universityName);
		
		System.out.println("List of subjects exam to be given by the candidate");
		for(int  i = 0; i < subjectNames.length; i++) {
		System.out.println(subjectNames[i]);
		}
		
	}

}
