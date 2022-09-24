class LEDFireTV{

        static String size;

	static String brand ;

	static String supportedInternetServices;

	static String displayTechnology;

	static String resolution;

	static String refreshRate;

	static int price;

        public static void main(String anu[]){

        System.out.println(size);

	System.out.println(brand);

	System.out.println(supportedInternetServices) ;

	System.out.println(displayTechnology) ;

	System.out.println(resolution);

	System.out.println(refreshRate);

	System.out.println(price);
	
        size = "32 Inches";

	brand = "AmazonBasics";

	supportedInternetServices = "Netflix, Sony liv, Alexa, Amazon Video, Hotstar, YouTube";

	displayTechnology = "LED";

	resolution = "720p";

	refreshRate = "60 Hz";

        price = 13499;
	
	System.out.println(" TV size is " + size);

	System.out.println("TV brand is " + brand);

	System.out.println("TV supported Internet Services are " + supportedInternetServices) ;

	System.out.println("TV display Technology is " + displayTechnology) ;

	System.out.println("TV resolution is " + resolution);

	System.out.println("TV refresh Rate is " + refreshRate);

	System.out.println("TV price is " + price);
	}
}