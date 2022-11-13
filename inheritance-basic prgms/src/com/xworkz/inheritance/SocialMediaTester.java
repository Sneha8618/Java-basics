package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Instagram;
import com.xworkz.inheritance.fruit.SocialMedia;

public class SocialMediaTester {
	
     public static void main(String args[]) {
		
		SocialMedia sm = new SocialMedia();
		sm.toEntertainment("27 billion");
		System.out.println("The max social media followers " + sm.followers);
		
		Instagram insta = new Instagram();
		insta.toEntertainment("758k");
		System.out.println("Instagram followers " + insta.followers);
		
	}

}
