class TorchTester{

     public static void main(String args[]){

       System.out.println("Started of main method");

       Torch.brand = "Fenix";
       Torch.color = "White";
       Torch.price = 250;

       Torch.onOrOff();
       Torch.increaseBrightness();
       Torch.increaseBrightness();
       Torch.increaseBrightness();
 
       Torch.decreaseBrightness();
       Torch.decreaseBrightness();
       Torch.decreaseBrightness();
       Torch.onOrOff();

      System.out.println("Ending of main method");
      }
}