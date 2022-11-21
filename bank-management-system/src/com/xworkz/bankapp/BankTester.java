package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankTester {
	
	public static void main(String args[]) {
		
		BankAccount account = new BankAccount();
		account.deposite(5000);
		account.deposite(7000);
		account.withDraw(1000);
		System.out.println("My account balance is" + account.getBalance());
		
		
		BankAccount friendsAccount = new BankAccount();
		friendsAccount.deposite(700);
		friendsAccount.deposite(4000);
		account.transfer(500.00, friendsAccount);
		System.out.println("Friends account balance is" + friendsAccount.getBalance());
		
		System.out.println("My  account balance is" + account.getBalance());
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposite(1000);
		savingsAccount.deposite(8000);
		savingsAccount.withDraw(2000);
		savingsAccount.periodicInterest();
		System.out.println("My account balance is" + savingsAccount.getBalance());
		
		SavingsAccount maaSavingsAccount = new SavingsAccount();
		maaSavingsAccount.deposite(1000);
		savingsAccount.transfer(4000, maaSavingsAccount);
		maaSavingsAccount.transfer(2000, savingsAccount);
		System.out.println("My savings account balance is" + savingsAccount.getBalance());
		System.out.println("My moms savings account balance is" + maaSavingsAccount.getBalance());
		
		SavingsAccount sisterSavingsAccount = new SavingsAccount();
		sisterSavingsAccount.deposite(1500);
		sisterSavingsAccount.transfer(1000, savingsAccount);
		savingsAccount.transfer(500, sisterSavingsAccount);
		System.out.println("My savings account balance is" + savingsAccount.getBalance());
		System.out.println("My sisters savings account balance is" + sisterSavingsAccount.getBalance());
		
		SavingsAccount savingsAccount2 = new SavingsAccount(0.7);
		//savingsAccount2.interestRate = 0.7;
		savingsAccount2.deposite(1000);
		savingsAccount2.periodicInterest();
		System.out.println(savingsAccount2.getBalance());
		
		CurrentAccount teaBusiness = new CurrentAccount();
		teaBusiness.deposite(3000);
		teaBusiness.deposite(10000);
		savingsAccount.transfer(1500, teaBusiness);
		savingsAccount.transfer(800, teaBusiness);
		teaBusiness.transfer(1000, savingsAccount);
		System.out.println("Tea business balance is" + teaBusiness.getBalance());
		
		
	}
	

}