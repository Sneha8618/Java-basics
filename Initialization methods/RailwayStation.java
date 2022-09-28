class RailwayStation{

     static int trainId;
	 static String trainName;
	 static String address;
	 static String type;
	 static String cityName;

       static void setTrainId(int id){
		   trainId = id;
	   }
	   static int getTrainId(){
		   return trainId;
	   }
	   
	   static void setTrainName(String tName){
		   trainName = tName;
	   }
	   static String getTrainName(){
		   return trainName;
	   }
	   
	   static void setAddress(String add){
		  address = add;
	   }
	   static String getAddress(){
		   return address;
	   }
	   
	   static void setType(String ty){
		   type = ty;
	   }
	   static String getType(){
		   return type;
	   }
	   
	   static void setCityName(String cName){
		   cityName = cName;
	   }
	   static String getCityName(){
		   return cityName;
	   }

}