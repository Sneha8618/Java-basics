class VesselTester{

     public static void main(String args[]){
	 
     Vessel.setVesselId(155);
	 Vessel.setVesselMadeOf("Stainless Steel");
	 Vessel.setType("Handi");
	 Vessel.setCapacity("2.1Liter");
	 Vessel.setDiameter("23cm");
	 Vessel.setPrice(545);
	 
	 System.out.println(Vessel.getVesselId());
	 System.out.println(Vessel.getVesselMadeOf());
	 System.out.println(Vessel.getType());
	 System.out.println(Vessel.getCapacity());
	 System.out.println(Vessel.getDiameter());
	 System.out.println(Vessel.getPrice());
	 
	 
	}

}