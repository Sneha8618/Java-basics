class Swiggy {

    // Pizza , Burger , Sandwitch , mosaranna , frechFries , SouthIndian , Pastries
    public static double takeOrder( String item,  int quantity ){
   
    if(item == "Pizza"){
	
	  System.out.println("Thank you for Ording "+ item);
	  
	  return 99.00 * quantity  ;
	  
	  //System.out.println("the price is"); this is not possible
	}
	
	if(item == "Burger"){
	
	   System.out.println("Thank you for Ording "+ item);
	   
	   return 60.00 * quantity ; 
	}
	
    if(item  == "SouthIndian"){
	
	   System.out.println("Thank you for Ording "+ item);
	   
	   return 135.00 * quantity ; 
	}
	
	if(item  == "mosaranna"){
	
	   System.out.println("Thank you for Ording "+ item);
	   
	   return 25.00 * quantity ; 
	}
	
	if(item == "Sandwitch"){
	
	   System.out.println("Thank you for Ording "+ item);
	   
	   return 45.00 * quantity ; 
	}
	
	if(item == "Pastries"){
	
	   System.out.println("Thank you for Ording "+ item);
	   
	   return 50.00 * quantity ; 
	
	// other statements
	//return ; 
	// other statements  -- not possible
	}
      
	   return 0.0 ; 
   }

}   
   
   
   
   