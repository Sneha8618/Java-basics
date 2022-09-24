class FridgeTester{

    public static void main(String fridge[]){

       Fridge.brandName = "Whirlpool";
       Fridge.capacity = "190 liters";
       Fridge.configuration = "Freezer-on-top";
       Fridge.color = "Blue";
       Fridge.energyStar = "3 star";
       Fridge.feature = "Stabilizer Free operation";
       Fridge.price = 25000;

       System.out.println(Fridge.brandName);
       System.out.println(Fridge.capacity);
       System.out.println(Fridge.configuration);
       System.out.println(Fridge.color);
       System.out.println(Fridge.energyStar);
       System.out.println(Fridge.feature);
       System.out.println(Fridge.price);
       }
}