class Restuarant{

     static void getFood(String[] foodMenu){
	 
	 System.out.println("Inside getFood()");
	 
	 System.out.println("Size of food menu" + foodMenu.length);
	 
	 System.out.println("List of food menu cantains");
	 
	   for(int index = 0; index < foodMenu.length; index++){
		   
		   System.out.println(foodMenu[index]);
	   }
	   
	 System.out.println("End of getFood()");
	 
	 }

}