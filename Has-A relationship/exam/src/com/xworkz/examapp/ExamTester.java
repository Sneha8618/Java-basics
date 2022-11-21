package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.HallTicket;
import com.xworkz.examapp.exam.SupplemetaryExam;

public class ExamTester {
	
	public static void main(String args[]) {
		
		String subjectNames[] = {"M1", "Os", "Vlsi", "DME1"};
		
		HallTicket hallTicket = new HallTicket("Manga", subjectNames, "1ER56ALL", "Dabba vtu");
		Exam exam = new Exam();
		exam.fees = 1200;
		boolean isAllowed = exam.allow(hallTicket);
		System.out.println("Allowed to write an exam : " +isAllowed);
		
		HallTicket hal = new HallTicket("Sneha", subjectNames, "2LB18EC015", "Vtu");
		Exam exam1 = new Exam();
		exam1.fees = 1300;
		boolean isAllow = exam1.allow(hal);
		System.out.println("Allowed to write an exam " +isAllow);
		
		HallTicket hal1 = new HallTicket("Anu", subjectNames, "2LB18EC012", "Vtu");
		Exam exam2 = new Exam();
		exam2.fees = 1100;
		boolean isAllows = exam1.allow(hal1);
		System.out.println("Allowed to write an exam " +isAllows);
		
		HallTicket hal2 = null ;
		Exam exam3 = new Exam();
		exam3.fees = 1100;
		boolean isAllowss = exam1.allow(hal2);
		System.out.println("Allowed to write an exam " +isAllowss);
		
		HallTicket hal3 = new HallTicket("Maha", subjectNames, "2LB18EC005", "vtu");
		Exam exam4 = new Exam();
		exam4.fees = 300;
		exam4.allow(hal3);
		
		
	}
}
