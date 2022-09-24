class Speaker{

      static String brand;   //default value is null
      static String color;
      static double price;
      static boolean isConnected;  //default value is false
      static int minVolume;
      static int maxVolume = 8;
      static int currentVolume ;

      // functionality
      public static boolean onOrOff(){

         System.out.println("Inside onOrOff()");

         // false ==  false
         if(isConnected == false){
              isConnected = true;
                System.out.println("Speaker is on..");
          }
        
         else if(isConnected == true){
               isConnected = false;
                  System.out.println("Speaker is off..");
         }


         System.out.println("Ending of onOrOff()");
         return isConnected;
     }


        public static void increaseVolume(){
         System.out.println("Inside increaseVolume()");
          if(isConnected ==  true){
          if(currentVolume < maxVolume){
            currentVolume = currentVolume + 1;
               System.out.println("The current volume is : " + currentVolume);
         }

         else {
             System.out.println("Max volume reached...");
         }
}
         else{
            System.out.println("First speaker on maadu");
         }
      


         System.out.println("Out of increaseVolume()");
  }




        public static void decreaseVolume(){
         System.out.println("Inside decreaseVolume()");

          //false == true
            if(isConnected ==  true){
            if(currentVolume > minVolume){
               currentVolume = currentVolume - 1;
                  System.out.println("The current volume is : " + currentVolume);
           }  

           else {
             System.out.println("Min volume reached...");
         }
    }

         else {
            System.out.println("First speaker on maadu");
         }
      
         System.out.println("End of decreaseVolume()");
     }

}




        