class Mouse{

      static String brand;

      static String color;

      static String connectivityTechnology;

      static String specialFeature ="Lightweight";

      static String movementDetectionTechnology="Optical";

      public static void main(String b[]){

      System.out.println("Mouse Brand is " + brand);

      System.out .println("Mouse color is " + color);

      System.out.println("Mouse connectivityTechnology is " + connectivityTechnology ); 

      brand ="Razer";

      color="Classic Black";

      connectivityTechnology="USB";

      System.out.println("Mouse Brand is " + brand);

      System.out .println("Mouse color is " + color);

      System.out.println("Mouse connectivityTechnology is " + connectivityTechnology );

      System.out.println("Mouse specialFeature is " + specialFeature);

      System.out.println("Mouse movementDetectionTechnology" + movementDetectionTechnology);
      }
}