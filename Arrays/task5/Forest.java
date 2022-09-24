class Forest{

    public static void main(String cricket[]){

        String forestName = "Nagarhole National Park";
        String forestType = "Moist deciduous forests";
        String totalArea = "848 km^2";
        String forestRegion = "Kodagu";
        String primaryAnimals[] = {"Tiger", "Lion", "Elephant", "Deer", "Leopard"};

       String forestFeatures[] = {forestName, forestType, totalArea, forestRegion};



       String ref0 = forestFeatures[0]; 
       String ref1 = forestFeatures[1];
       String ref2 = forestFeatures[2];
       String ref3 = forestFeatures[3];
        

       System.out.println("Forest name is " + ref0);
       System.out.println("Forest type is " + ref1);
       System.out.println("Forest total area is " + ref2);
       System.out.println("Forest region is " + ref3);

       System.out.println("List of primary animals in forest are");
       for(int z=0; z<primaryAnimals.length; z++){
       System.out.println(primaryAnimals[z]);
       }
  }
}
