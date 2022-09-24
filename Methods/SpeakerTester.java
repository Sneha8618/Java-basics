class SpeakerTester{

     public static void main(String args[]){

       System.out.println("Started of main method");

       Speaker.brand = "boat";
       Speaker.color = "black";
       Speaker.price = 3000.00;

       // invoking onOrOff whith zero argumets

       Speaker.onOrOff();
       Speaker.increaseVolume();
       Speaker.increaseVolume();
       Speaker.increaseVolume();

   // decrease volume
       Speaker.decreaseVolume();
       Speaker.decreaseVolume();
       Speaker.decreaseVolume();
       Speaker.onOrOff();
       Speaker.increaseVolume();
       Speaker.increaseVolume();
       Speaker.onOrOff();
     
       System.out.println("Main method ended");
       }
}

        