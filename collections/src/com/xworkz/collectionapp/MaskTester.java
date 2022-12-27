package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MaskTester {
	
	public static void main(String[] args) {
		
		MaskDTO dto1 = new MaskDTO("Pink", 10D);
		MaskDTO dto2 = new MaskDTO("Black", 25D);
		MaskDTO dto3 = new MaskDTO("Yellow", 30D);
		
		Collection<MaskDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		
		Iterator<MaskDTO> ref = collection.iterator();
		while(ref.hasNext()) {
			MaskDTO value = ref.next();
			
			if(value.getPrice() > 25) {
				System.out.println(value);
				ref.remove();
			}
			
			if(value.getPrice() > 10) {
				System.out.println(value);
			}
			
			if("Pink".equals(value.getColor())) {
				System.out.println(value);
				ref.remove();
			}
			
			System.out.println("color of mask " + value.getColor());
			
			
			
			
				
			}
		
		}

	
		
		
	}


