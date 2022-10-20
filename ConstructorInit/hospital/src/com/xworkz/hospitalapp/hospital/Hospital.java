package com.xworkz.hospitalapp.hospital;

public class Hospital {
	
	//Datatype variableName[] = {};
	
	 //String patientNames[] = {null, null, null, null, null, null, null};
	//int patientAges[] = {0, 0, 0, 0, 0, 0, 0};
	
	//Datatype variableNames[] = new Datatype[size]; - we use this type
	
	 String patientNames[] = new String[6];
	 int index;
	 
	 public Hospital() {
		 System.out.println("Hospital constructor is called.....");	 
	 }
	 
	    public boolean savePatientNames(String patientName) {
	    	System.out.println("inside savePatientNames");
	    	  if(patientName != null && patientNames.length > index) {
	    		  patientNames[index++] = patientName;
	    		  return true;
	    	  }
	    	  else {
	    		  System.out.println("Patient names is full.... Bed illa");
	    	  }
	    	
	    	System.out.println("end of savePatientNames");
	    	return false;
	    }
	    
	    public void getPatientNames() {
	    	System.out.println("list of patient nmaes");
	    	for(int i = 0; i < patientNames.length; i++) {
	    		System.out.println(patientNames[i] + " ");
	    	}
	    }
	    
	    //oldPatientName = "Guna";
	    //newPatientName = "Guna Sarkar";
	    public boolean updatePatientNames(String oldPatientName, String newPatientName) {
	    	System.out.println("inside updatePatientNames");
	    	for(int i = 0; i < patientNames.length; i++) {
	    		//
	    		if(patientNames[i] == oldPatientName) {
	    			patientNames[i] = newPatientName;
        			return true;
	    		}
	    		else {
	    			//you have to get one negative messages
	    			
	    		}
	    	}
	    	return false;
	    }
}
