class ShowRoom{

    static void getCars(String[] cars){
	 
    System.out.println("Inside getCars()");

    System.out.println("Size of cars is " + cars.length);

    System.out.println("List of cars are");

      for(int index = 0; index < cars.length; index++){
		  
		  System.out.println(cars[index]);
	  }	
	  
	System.out.println("End of getCras()");
		
	}
	
	static void getBikes(String[] bikes){
		
    System.out.println("Inside getBikes()");
	
	System.out.println("Size of bikes is" + bikes.length);
	
	System.out.println("List of Bikes are");
	
	  for(int index = 0; index < bikes.length; index++){
		  
		  System.out.println(bikes[index]);
		  
	  }
	  
	System.out.println("End of getBikes()");
	
	}

}