class TVTester{

        public static void main(String args[]){

        System.out.println("Started of main method");

         TV.brand = "Samsung";
         TV.color = "black";
         TV.price = 30000.00;

         TV.onOrOff();
         TV.increaseVolume();
         TV.increaseVolume();
         TV.increaseVolume();
         TV.increaseVolume();

         //decrease volume
         TV.decreaseVolume();
         TV.decreaseVolume();
         TV.decreaseVolume();
         TV.onOrOff();

       System.out.println("Ending of main method");
       }
}