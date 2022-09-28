class FurnitureTester{

      public static void main(String args[]){
	  
	  Furniture.setFurnitureId(265);
	  Furniture.setName("Pluto Wood Bed");
	  Furniture.setMaterialUsed("Solid Wood");
	  Furniture.setDepth("209.55cm");
	  Furniture.setHeight("90.17cm");
	  Furniture.setColor("Brown");
	  
	  System.out.println(Furniture.getFurnitureId());
	  System.out.println(Furniture.getName());
	  System.out.println(Furniture.getMaterialUsed());
	  System.out.println(Furniture.getDepth());
	  System.out.println(Furniture.getHeight());
	  System.out.println(Furniture.getColor());
	 
	 }


}