class SoapTester{

        public static void main(String args[]){
		
		//purpose of object is to creat a multiple copy of a class
		
		//creat a multiple of soap
		//object creation of soap class
		//ClassName ref = new className();
		
		Soap soap = new Soap();
		soap.shape = "Rectangle";
		soap.color = "Orange";
		soap.name = "Mysore Sandal Soap";
		soap.toGetFresh();
		System.out.println(soap.shape + " "+ soap.color);
		
		Soap soap1 = new Soap();
		soap1.shape = "Oval";
		soap1.color = "Cream";
		soap1.name = "pears";
		soap1.toGetFresh();
		System.out.println(soap1.shape + " "+ soap1.color);
		
		Soap sp = new Soap();
		sp.shape = "Round";
		sp.color = "Orange";
		sp.name = "Santoor";
		sp.toGetFresh();
		System.out.println(sp.shape + " "+ sp.color);
		
		
		
		}



}