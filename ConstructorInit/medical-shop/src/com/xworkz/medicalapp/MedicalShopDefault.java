package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;

public class MedicalShopDefault {
	
public static void main(String[] args) {
		
		MedicalShop med = new MedicalShop( );
		med.gstNo = "AAE5368288012983";
		med.address = "Vijaynagar";
		med.name = "Maruthi Medical";
		med.noOfSections = 10;
		
		med.staffNames = new String[3];
		med.staffNames[0] = "Narang";
		med.staffNames[1] = "sarang";
		med.staffNames[2] = "Bajarang";
		
		med.staffContactNo = new long[3];
		med.staffContactNo[0] = 8618461535L;
		med.staffContactNo[1] = 9353212141L;
		med.staffContactNo[2] = 6360905588L;
		
		med.medicineName = new String[5];
		med.medicineName[0] = "Paracetemol";
		med.medicineName[1] = "Cipla";
		med.medicineName[2] = "Bruffin 400";
		med.medicineName[3] = "Dolo";
		med.medicineName[4] = "B-complex";
		
		med.cosmetics = new String[5];
		med.cosmetics[0] = "Homalaya Cream";
		med.cosmetics[1] = "Jhonson baby powder";
		med.cosmetics[2] = "Detol soap";
		med.cosmetics[3] = "Shampoos";
		med.cosmetics[4] = "Everyouth face wash";
		
		med.billingMethod = new String[4];
		med.billingMethod[0] = "Hand cash";
		med.billingMethod[1] = "Phone pay";
		med.billingMethod[2] = "Google pay";
		med.billingMethod[3] = "Paytm";
		
		med.displayInfo();

   }
}
