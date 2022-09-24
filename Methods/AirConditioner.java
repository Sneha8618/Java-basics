class AirConditioner{

       static String brand;
       static String color;
       static double price;
       static boolean isConnected;
       static int minTemp;
       static int maxTemp = 95;
       static int currentTemp;

       public static boolean onOrOff(){

         System.out.println("Inside onOrOff()");

         if(isConnected == false){
            isConnected = true;
              System.out.println("Air conditioner is on...");
         }

        else if(isConnected == true){
            isConnected = false;
              System.out.println("Air Conditioner is off..");
        }

          System.out.println("Ending of onOrOff()");
          return isConnected;
          }

            public static void increaseTemp(){
         System.out.println("Inside increaseTemp()");
          if(isConnected ==  true){
          if(currentTemp < maxTemp){
            currentTemp = currentTemp + 1;
               System.out.println("The current tempreature is : " + currentTemp);
         }

         else {
             System.out.println("Max temp reached...");
         }
}
         else{
            System.out.println("First air conditioner on maadu");
         }
      


         System.out.println("Out of increaseTemp()");
  }

        public static void decreaseTemp(){
         System.out.println("Inside decreaseTemp()");

          //false == true
            if(isConnected ==  true){
            if(currentTemp > minTemp){
               currentTemp = currentTemp - 1;
                  System.out.println("The current tempreature is : " + currentTemp);
           }  

           else {
             System.out.println("Min tempreature reached...");
         }
    }

         else {
            System.out.println("First air conditioner on maadu");
         }
      
         System.out.println("End of decreaseTemp()");
     }

}



