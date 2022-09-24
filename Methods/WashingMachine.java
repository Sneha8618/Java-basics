class WashingMachine{

       static String brand;
       static String color;
       static double price;
       static boolean isWashed;
       static int minSpeed;
       static int maxSpeed = 50;
       static int currentSpeed;
      

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

          public static void increaseSpeed(){
           System.out.println("Inside onOrOff()");
           if(isWashed == true){
           if(currentSpeed < maxSpeed){
              currentSpeed = currentSpeed + 1;
                System.out.println("The current speed is :" + currentSpeed);
            }
           
            else{
                 System.out.println("Max speed reached");
           }
    }
            else{
                  System.out.println("First on the washing machine");
          }
            System.out.println("End of onOrOff");
    }


           public static void decreaseSpeed(){

           System.out.println("Inside onOrOff()");
           if(isWashed == true){
           if(currentSpeed > minSpeed){
              currentSpeed = currentSpeed - 1;
                System.out.println("The current Speed is :" + currentSpeed);
            }
           
            else{
                 System.out.println("Min Speed reached");
           }
    }
            else{
                  System.out.println("First on the washing machine");
          }
            System.out.println("End of onOrOff");
    }
}







           