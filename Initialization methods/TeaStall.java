class TeaStall{

     static int teaStallId ;
	 static String name;
	 static String address;
	 static long contactNo;
	
	
	 static void setTeaStallId(int id){
		teaStallId = id;
	}

     static int getTeaStallId(){
	  return teaStallId;
	}
	
	static void setName(String na){
		name = na;
	}
	
	static String getName(){
		return name;
	}
	
	static void setAddress(String addr){
		address = addr;
	}
	
	static String getAddress(){
		return address;
	}
	
	static void setContactNo(long cNo){
	   contactNo = cNo;
	}
	 
	 static long getContactNo(){
	   return contactNo;
	}
	
}