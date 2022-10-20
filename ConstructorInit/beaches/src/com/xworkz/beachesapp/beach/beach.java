package com.xworkz.beachesapp;

public class beach {

	       static String beachNames[] = {null, null, null, null, null};
		   
		   static int index ;
		   
		   public static boolean addBeachNames(String beachName){
			   
			   System.out.println("inside addBeachNames");
				 
				 if(beachNames.length > index){
				 
			     beachNames[index] = beachName;
			       
				   index ++;
				   
				 }
				 
				 else{
					 
				   System.out.println("beaches names length is exceed");
			    
			    }
				
				
				   System.out.println("end addBeachNames");
				   
				   return true;
		   }
		   
	        //Read operation
		   
	       public static void getBeachNames(){
			
		   for(int index = 0; index < beachNames.length; index++){
			
			  String ref = beachNames[index];
				
			    System.out.println("Beach name is " + ref);
			
			}
			
			
		}

	}


