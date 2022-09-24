class WashingMachine{

       static String brand;
       static String color;
       static double price;
       static boolean iswashed;

       public static boolean onOrOff(){

         System.out.println("Inside onOrOff()");

         if(isWashed == false){
            isWashed = true;
              System.out.println("Washing machine is on...");
         }

        else if(isWashed == true){
            isWashed = false;
              System.out.println("Washing machine is off..");
        }

          System.out.println("Ending of onOrOff()");
          return isWashed;
          }
}