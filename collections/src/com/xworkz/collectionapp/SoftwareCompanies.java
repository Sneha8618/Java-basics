package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SoftwareCompanies {
	
	public static void main(String[] args) {
		
		String cmp1 = "TCS";
		String cmp2 = "Infosys";
		String cmp3 = "Wipro";
		String cmp4 = "Capgemini";
		String cmp5 = "Cognizant";
		String cmp6 = "HCL";
		String cmp7 = "Sign of Semiconductors";
		String cmp8 = "Sonicwall";
		String cmp9 = "Amazon";
		String cmp10 = "Google";
		String cmp11 = "Tata";
		String cmp12 = "Harman";
		String cmp13 = "Acuvate";
		String cmp14 = "Emphasis";
		String cmp15 = "HP";
		String cmp16 = "Clayfin";
		String cmp17 = "Contenio";
		String cmp18 = "Myntree";
		String cmp19 = "Atos";
		String cmp20 = "Bitron";
		
		Collection<String> company = new TreeSet();
		company.add(cmp1);
		company.add(cmp2);
		company.add(cmp3);
		company.add(cmp4);
		company.add(cmp5);
		company.add(cmp6);
		company.add(cmp7);
		company.add(cmp8);
		company.add(cmp10);
		company.add(cmp11);
		company.add(cmp12);
		company.add(cmp13);
		company.add(cmp14);
		company.add(cmp15);
		company.add(cmp16);
		company.add(cmp17);
		company.add(cmp18);
		company.add(cmp19);
		company.add(cmp20);
		
		System.out.println(company);
		
		for(String element : company) {
			System.out.println(element);
		}
		
		System.out.println("Access the values using iterator");
		Iterator<String> ref = company.iterator();
		while(ref.hasNext()) {
			String value = ref.next();
			System.out.println(value);
		}
	}

}
