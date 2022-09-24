class Torch{

    static String brand;
    static String color;
    static double price;
    static boolean isPowered;
    static int minBrightness;
    static int maxBrightness = 4;
    static int currentBrightness;

      public static boolean onOrOff(){ 
 
      System.out.println("Inside yesOrNo()");

       if(isPowered == false){
           isPowered = true;
             System.out.println("Torch is on..");
       }

       
       else if(isPowered == true){
           isPowered = false;
             System.out.println("Torch is off..");
       }

        System.out.println("Ended of yesOrNo()");
        return isPowered;
       }

         public static void increaseBrightness(){
         System.out.println("Inside increaseBrightness()");
          if(isPowered ==  true){
          if(currentBrightness < maxBrightness){
            currentBrightness = currentBrightness + 1;
               System.out.println("The current Brightness is : " + currentBrightness);
         }

         else {
             System.out.println("Max Brightness reached...");
         }
}
         else{
            System.out.println("First torch on maadu");
         }
      


         System.out.println("Out of increaseBrightness()");
  }




        public static void decreaseBrightness(){
         System.out.println("Inside decreaseBrightness()");

          //false == true
            if(isPowered ==  true){
            if(currentBrightness > minBrightness){
               currentBrightness = currentBrightness - 1;
                  System.out.println("The current Brightness is : " + currentBrightness);
           }  

           else {
             System.out.println("Min Brightness reached...");
         }
    }

         else {
            System.out.println("First torch on maadu");
         }
      
         System.out.println("End of decreaseBrightness()");
     }

}



