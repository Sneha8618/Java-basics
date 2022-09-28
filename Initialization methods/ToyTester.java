class ToyTester{

       public static void main(String args[]){
	   
	   Toy.setToyId(45);
	   Toy.setName("Doldoa");
	   Toy.setColor("Pink");
	   Toy.setMaterial("Plush");
       Toy.setCharacter("Animal");

       System.out.println(Toy.getToyId());
       System.out.println(Toy.getName());
	   System.out.println(Toy.getColor());
	   System.out.println(Toy.getMaterial());
	   System.out.println(Toy.getCharacter());
	   
	  }
}