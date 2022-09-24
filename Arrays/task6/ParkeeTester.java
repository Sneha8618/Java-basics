class ParkeeTester{

     public static void main(String parkee[]){

       Parkee.brandName = "Scotch-Brite";
       Parkee.style = "Single";
       Parkee.material = "Plastic";
       Parkee.color = "Green";
       Parkee.itemWeight = "20 Grams";
       Parkee.itemDimensions = "6*2*10 Centimeters";
       Parkee.price = 280;
 
       System.out.println(Parkee.brandName);
       System.out.println(Parkee.style);
       System.out.println(Parkee.material);
       System.out.println(Parkee.color);
       System.out.println(Parkee.itemWeight);
       System.out.println(Parkee.itemDimensions);
       System.out.println(Parkee.price);
       }
}