class SwiggyTester{

     public static void main(String a[]){
 
 // invoking a method
 
    double itemPrice = Swigggy.takeOrder("mosaranna");
	
	System.out.println("The item price is " + itemPrice);
 
    double itemPriceWithQuantity = Swiggy.takeOrder("mosaranna") ;
	
	System.out.println("The item quantity is " + itemPriceWithQuantity);
	 
     //Swiggy.takeOrder("mosaranna", price) ; 
	 
     System.out.println("Your Final Is Ready... Enjoyy");
 
   }

}