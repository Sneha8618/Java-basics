class RailwayStationTester{

     public static void main(String args[]){
	 
	 RailwayStation.setTrainId(5874);
	 RailwayStation.setTrainName("Chalukya Express");
	 RailwayStation.setAddress("Yashwantpur Station");
	 RailwayStation.setType("Sleeper Coach");
	 RailwayStation.setCityName("Banglore");
	 
	 System.out.println(RailwayStation.getTrainId());
	 System.out.println(RailwayStation.getTrainName());
	 System.out.println(RailwayStation.getAddress());
	 System.out.println(RailwayStation.getType());
	 System.out.println(RailwayStation.getCityName());
	 
	 }
}