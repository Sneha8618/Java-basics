package com.xworkz.examapp.exam;

public class SupplemetaryExam extends Exam {
	
	int noOfAttempts;
	
	public SupplemetaryExam(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
	
	@Override /* metadata which is used to give information to the compiler */
	public boolean allow(HallTicket hallTicket) {
		System.out.println("Invoked alllow method of Supplementary exam");
		if(noOfAttempts > 1) {
			return super.allow(hallTicket);
		}
		return false;
		
		
	}
}
