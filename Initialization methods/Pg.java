class Pg{

     static int pgId;
	 static String name;
	 static String address;
	 static String type;

       static void setPgId(int id){
		   pgId = id;
	   }
	   static int getPgId(){
		   return pgId;
	   }
	   
	   static void setName(String na){
		   name = na;
	   }
	   static String getName(){
		   return name;
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
}