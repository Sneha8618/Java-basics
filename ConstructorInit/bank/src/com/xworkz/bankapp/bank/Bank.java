package com.xworkz.bankapp;

public class Bank {

	       static String bankNames[] = {null, null, null, null, null};
		   
		   static int index ;
		   
		   public static boolean addBankNames(String bankName){
			   
			   System.out.println("inside addBankNames");
			   
			   if(bankNames.length > index){
				   
				   bankNames[index] = bankName;
				   
				   index++;
				   
				  // return true;
			   }
				 
			    else{
					
					System.out.println("Exceed the data");
				
				}
					
					System.out.println("end addBankNames");
				 
				    return true;
				
			      
	       }
		   
	        //Read operation
		   
	       public static void getBankNames(){
			
		   for(int index = 0; index < bankNames.length; index++){
			
			  String ref = bankNames[index];
				
			    System.out.println("bank names is " + ref);
			
			}
			
			
		}

	}


