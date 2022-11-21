package com.xworkz.bankapp;

import com.xworkz.bankapp.savings.SavingsAccount;

public class SavingsTester {
	
	public static void main(String args[]) {
		
		SavingsAccount account = new SavingsAccount();
		account.name = "Hdfc Bank";
		System.out.println(account.name);
	}

}
