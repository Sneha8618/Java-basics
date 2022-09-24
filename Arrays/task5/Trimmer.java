class Trimmer{

    public static void main(String cricket[]){

        String color = "Grey";
        String brandName = "Philips";
        int price = 3997 ;
        String working = "Trimming";
        String warranty = "2 year";
        String settings[] = {"on", "off"};

        String trimmerFeatures[] = {color, brandName, working, warranty};

       String ref0 = trimmerFeatures[0]; 
       String ref1 = trimmerFeatures[1];
       String ref2 = trimmerFeatures[2];
       String ref3 = trimmerFeatures[3];
        

       System.out.println("Trimmer color is " + ref0);
       System.out.println("Trimmer brand name is " + ref1);
       System.out.println("Trimmer price is " + price);
       System.out.println("Trimmer working is " + ref2);
       System.out.println("Trimmer warranty is " + ref3);

       System.out.println("Trimmer settings are");
       for(int trimmer=0; trimmer<settings.length; trimmer++){
       System.out.println(settings[trimmer]);
       }
  }
}
