package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Tcs;
import com.xworkz.inheritance.fruit.Company;

public class CompanyTester {
	
	public static void main(String args[]) {
		
		Company cmp = new Company();
		cmp.toGetJob();
		
		Tcs cmp1 = new Tcs();
		cmp1.toBuildSoftwares("MNC company");
		System.out.println("Tcs is a" + cmp1.type);
	}

}
