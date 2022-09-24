class TV{

       static String brand;
       static String color;
       static double price;
       static boolean isDisplay;
       static int minVolume;
       static int maxVolume = 10;
       static int currentVolume;

       public static boolean onOrOff(){

         System.out.println("Inside onOrOff()");

         if(isDisplay == false){
            isDisplay = true;
              System.out.println("TV is on...");
         }

        else if(isDisplay == true){
            isDisplay = false;
              System.out.println("TV is off..");
        }

          System.out.println("Ending of onOrOff()");
          return isDisplay;
          }

          public static void increaseVolume(){

           System.out.println("Inside onOrOff()");
           if(isDisplay == true){
           if(currentVolume < maxVolume){
              currentVolume = currentVolume + 1;
                System.out.println("The current volume is :" + currentVolume);
            }
           
            else{
                 System.out.println("Max volume reached");
           }
    }
            else{
                  System.out.println("First on the TV");
          }
            System.out.println("End of onOrOff");
    }


           public static void decreaseVolume(){

           System.out.println("Inside onOrOff()");
           if(isDisplay == true){
           if(currentVolume > minVolume){
              currentVolume = currentVolume - 1;
                System.out.println("The current volume is :" + currentVolume);
            }
           
            else{
                 System.out.println("Min volume reached");
           }
    }
            else{
                  System.out.println("First on the TV");
          }
            System.out.println("End of onOrOff");
    }
}









