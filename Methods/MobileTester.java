class MobileTester{

        public static void main(String args[]){
 
         System.out.println("Starting of main method");
    
         Mobile.brand = "Red MI";
         Mobile.color = "Black";
         Mobile.RAM = "3 GB";
         Mobile.price = 8000.00;

         Mobile.onOrOff();
         
       Mobile.increaseVolume();
       Mobile.increaseVolume();
       Mobile.increaseVolume();

   // decrease volume
       Mobile.decreaseVolume();
       Mobile.decreaseVolume();
       Mobile.decreaseVolume();
       Mobile.onOrOff();
       Mobile.increaseVolume();
       Mobile.increaseVolume();
       Mobile.onOrOff();
       Mobile.onOrOff();

        System.out.println(Mobile.brand);
        System.out.println(Mobile.color);
        System.out.println(Mobile.RAM);
        System.out.println(Mobile.price);

        System.out.println("Ending of main method");
        }
}