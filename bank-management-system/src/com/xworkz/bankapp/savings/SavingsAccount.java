package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount {
	
	public String name;
	
	public double interestRate;
	
	public SavingsAccount() {
		System.out.println("Savings account object is created");
	}
	
	public SavingsAccount(double interestRate) {
		super();
		System.out.println("Savings account object is created");
		this.interestRate = interestRate;
	}
	
	//savings account specific method
	public void periodicInterest() {
		double newBalance = super.getBalance() * this.interestRate / 100;	
		deposite(newBalance);
	}

}
 //delhi is a unionterritpry
//flipcart is a ecommarcewebsite
//google is a searchengine
//levista is a coffee powder -- toMakeCoffee(method)  
//deepavali is a festival
//Ecenginegeer is a engineer - togetGraduated, 4 objects