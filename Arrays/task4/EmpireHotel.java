class EmpireHotel{

      public static void main(String args[]){

      String type = "5 star Hotel";
      String address = "Rajajinagar";
      String managerNames[] = {"Sneha", "Sahana", "Annakarmel", "Mahananda", "Muskan", "Swati", "Vishalakshi"};
      int noOfManagers = 7;
      String hotelfoodMenu[] = {"Egg biriyani", "Lemon Rice", "Curd Rice", "Chicken Biriyani", "Veg Biriyani", "mutton Biriyani", "Prawns Biriyani", "Jeera Rice"};

      System.out.println("Welcome to EmipreHotel");

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
      for(int n=0; n<hotelfoodMenu.length; n++){
      System.out.println(hotelfoodMenu[n]);
      }
      }
}
  