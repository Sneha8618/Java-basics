class Garrage{

    static void getVehicleNos(String[] vehicleNos){
	
	System.out.println("Inside getVehicleNos()");
	
	System.out.println("Size of vehicle nos is"  + vehicleNos.length);
	
	System.out.println("List of vehicle numbers are");
	
	  for(int index = 0; index < vehicleNos.length; index++){
		  
		  System.out.println(vehicleNos[index]);
	  }
	  
	System.out.println("End of getVehicleNos()");
	
	}

}