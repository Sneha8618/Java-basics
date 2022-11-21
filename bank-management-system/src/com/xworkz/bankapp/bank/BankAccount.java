package com.xworkz.bankapp.bank;

public class BankAccount {
	
	public String name;
	String ifscCode;
	String branchName;
	String accountNo;
	//Encapsulation
	private double balance; //access-modifier
	
	public BankAccount() {
	  System.out.println("Bank account object is created");
	}
	
	public double withDraw(double balance) {
		System.out.println("Amount to be withdrawn" + balance);
		this.balance = this.balance-balance;
		return this.balance;
		
	}
	
	public double deposite(double balance) {
		System.out.println("Amount to be deposited" + balance);
		this.balance = this.balance+balance;
		return this.balance;
	}
	
	public void transfer(double amount, BankAccount friendsAccount) {
		System.out.println("Transfering to friends account");
		withDraw(amount);
		friendsAccount.deposite(amount);
		System.out.println("Transfering done..  Transaction successfull");
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

}
