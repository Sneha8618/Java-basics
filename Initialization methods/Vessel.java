class Vessel{

      static int vesselId;
      static String vesselMadeOf;
	  static String type;
	  static String capacity;
	  static String diameter;
	  static int price;
	  
	  static void setVesselId(int id){
	     vesselId = id;;
	  }
	  static int getVesselId(){
	     return vesselId;
	  }
	  
	  static void setVesselMadeOf(String madeOf){
	     vesselMadeOf = madeOf;
	  }
	  static String getVesselMadeOf(){
	      return vesselMadeOf;
	  }
	  
	  static void setType(String ty){
	      type = ty;
	  }
	  static String getType(){
	     return type;
	  }
	  
	  static void setCapacity(String cap){
	      capacity = cap;
	  }
	  static String getCapacity(){
	     return capacity;
	  }
	  
	  static void setDiameter(String dia){
	     diameter = dia;
	  }
	  static String getDiameter(){
	      return diameter;
	  }
	  
	  static void setPrice(int prc){
	      price = prc;
	  }
	  static int getPrice(){
	      return price;
	  }


}