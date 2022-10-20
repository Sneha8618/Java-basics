package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;

public class MedicalShopTester {

	public static void main(String[] args) {
		
		//med.gstNo = "AAE5368288012983";
		//med.address = "Vijaynagar";
		//med.name = "Maruthi Medical";
		//med.noOfSections = 10;
		
		//med.staffNames[] = new String[3];
		String staffNames[] = new String[3];
		staffNames[0] = "Narang";
		staffNames[1] = "sarang";
		staffNames[2] = "Bajarang";
		
		long staffContactNo[] = new long[3];
		staffContactNo[0] = 8618461535L;
		staffContactNo[1] = 9353212141L;
		staffContactNo[2] = 6360905588L;
		
		String medicineName[] = new String[5];
		medicineName[0] = "Paracetemol";
		medicineName[1] = "Cipla";
		medicineName[2] = "Bruffin 400";
		medicineName[3] = "Dolo";
		medicineName[4] = "B-complex";
		
		String cosmetics[] = new String[5];
		cosmetics[0] = "Homalaya Cream";
		cosmetics[1] = "Jhonson baby powder";
		cosmetics[2] = "Detol soap";
		cosmetics[3] = "Shampoos";
		cosmetics[4] = "Everyouth face wash";
		
		String billingMethod[] = new String[4];
		billingMethod[0] = "Hand cash";
		billingMethod[1] = "Phone pay";
		billingMethod[2] = "Google pay";
		billingMethod[3] = "Paytm";
		
		//int noOfSections = 5;
		
		MedicalShop med = new MedicalShop("AAE5368288012983", "Vijaynagar", "Maruthi Medical", staffNames, staffContactNo, medicineName, cosmetics, 5, billingMethod);
		
		med.displayInfo();
		

	}

}
