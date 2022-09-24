class Mobile{

    static String brand;
    static String color;
    static String RAM;
    static double price;
    static boolean isConnected;
    static int minVolume;
    static int maxVolume = 10;
    static int currentVolume;

      public static boolean onOrOff(){ 
 
      System.out.println("Inside onOrOff()");

       if(isConnected == false){
           isConnected = true;
             System.out.println("Mobile is on..");
       }

       
       else if(isConnected == true){
           isConnected = false;
             System.out.println("Mobile is off..");
       }

        System.out.println("Ended of onOrOff()");
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
            System.out.println("First mobile on maadu");
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
            System.out.println("First mobile on maadu");
         }
      
         System.out.println("End of decreaseVolume()");
     }

}



