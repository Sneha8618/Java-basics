class VivantaTajHotel{

      public static void main(String args[]){

      String type = "5 star Hotel";
      String address = "Yeshwanthpur";
      String managerNames[] = {"Akshata", "Lakshmi", "Sangeeta", "Ganesh", "Sumanth"};
      int noOfManagers = 5;
      String foodMenu[] = {"Dosa", "Puri", "Idly", "Roti", "Chapati", "Gobi manchuri", "French fries", "Jeera rice", "Upma", "poha", "Sweet rice", "vada paav", "Bonda", "Bajji", "Parota"};

      System.out.println("Welcome to vivantaTajHotel");

      System.out.println("******************************");

      System.out.println("Hotel type is" + " " + type);

      System.out.println("******************************");

      System.out.println("Destination" + " " + address);

      System.out.println("******************************");

      System.out.println("Name of list of managers");
      System.out.println("---------------------");
      for(int s= 0; s<managerNames.length; s++){
      System.out.println(managerNames[s]);
      }

      System.out.println("******************************");

      System.out.println("No of managers in the hotel are" + " " + noOfManagers);

      System.out.println("******************************");

      System.out.println("Food menu contains");
      System.out.println("---------------------");
      for(int n=0; n<foodMenu.length; n++){
      System.out.println(foodMenu[n]);
      }
      }
}
  