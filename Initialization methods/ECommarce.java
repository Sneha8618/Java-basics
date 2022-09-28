class ECommarce{

       static int eCommarceId;
	   static String name; //rengvo
	   static String interactivity;
	   static String type; //B2B,B2C,G2B

       static void setECommarceId(int id){
		   eCommarceId = id;
	   }
	   static int getECommarceId(){
		   return eCommarceId;
	   }
	   
	   static void setName(String na){
		   name = na;
	   }
	   static String getName(){
		   return name;
	   }
	   
	   static void setInteractivity(String inter){
		  interactivity = inter;
	   }
	   static String getInteractivity(){
		   return interactivity;
	   }
	   
	   static void setType(String ty){
		   type = ty;
	   }
	   static String getType(){
		   return type;
	   }
	   
}