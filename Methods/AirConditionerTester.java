class AirConditionerTester{

        public static void main(String args[]){

        System.out.println("Started of main method");

         AirConditioner.brand = "Hitachi";
         AirConditioner.color = "Red";
         AirConditioner.price = 15000.00;

         AirConditioner.onOrOff();
         
       AirConditioner.increaseTemp();
       AirConditioner.increaseTemp();
       AirConditioner.increaseTemp();
       AirConditioner.increaseTemp();

         //decrease speed
        AirConditioner.decreaseTemp();
        AirConditioner.decreaseTemp();
        AirConditioner.decreaseTemp();

        AirConditioner.onOrOff();

        AirConditioner.increaseTemp();
        AirConditioner.increaseTemp();
        AirConditioner.onOrOff();

       System.out.println("Ending of main method");
       }
}