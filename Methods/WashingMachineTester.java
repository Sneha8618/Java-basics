class WashingMachineTester{

     public static void main(String args[]){

       System.out.println("Started of main method");

       WashingMachine.brand = "Whirlpool";
       WashingMachine.color = "Brown";
       WashingMachine.price = 25000;

       WashingMachine.onOrOff();
       WashingMachine.increaseSpeed();
       WashingMachine.increaseSpeed();
       WashingMachine.increaseSpeed();
       WashingMachine.increaseSpeed();

         //decrease speed
        WashingMachine.decreaseSpeed();
        WashingMachine.decreaseSpeed();
        WashingMachine.decreaseSpeed();

        WashingMachine.onOrOff();

        WashingMachine.increaseSpeed();
        WashingMachine.increaseSpeed();

      System.out.println("Ending of main method");
      }
}