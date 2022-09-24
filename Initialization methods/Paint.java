class Paint{

      static int paintId;
	  static String brandName;
	  static String color;
	  
	  static void setPaintId(int id){
	     paintId = id;
	  }
	  
	  static int getPaintId(){
	     return paintId;
	  }
	  
	  static void setBrandName(String bName){
	      brandName = bName;
	  }
	  
	  static String getBrandName(){
	     return brandName;
	  }
	  
	  static void setColor(String colr){
	     color = colr;
	  }
	  
	  static String getColor(){
	     return color;
	  }
}