package com.xworkz.examapp.exam;

public class Exam {
	
	//exam has HallTicket --
	//ex : has-A-relationship(Associating one class other)
	
	public HallTicket hallTicket;
	public int fees;
	public boolean isAllowed;
	
	public boolean allow(HallTicket hallTicket) {
	     isAllowed = false;
		System.out.println("inside allow method");
		System.out.println("The fees paid is: " +this.fees);
		
		if(fees >= 1200) {
			System.out.println("Fees is paid");
			
			if(hallTicket != null) {
				this.hallTicket = hallTicket;
				System.out.println("Details of candidate hallticket are");
				this.hallTicket.displayDetails();
				isAllowed  = true;
				System.out.println("Hall ticket is been issued : now you are allow to exam");
		}
		else {
			System.out.println("No Hallticket is found");
		}
	}
			else {
				System.out.println("First pay the fees");
			}
		    return isAllowed;
		}
}
	
	


