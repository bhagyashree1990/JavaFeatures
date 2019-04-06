package com.java11.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionsToArrayExample {

	public static void main(String[] args) {
		List<String> nameList  = new ArrayList<String>();
		nameList.add("Larry");
		nameList.add("Jeff");
		nameList.add("Bill");
		nameList.add("Steve");
		nameList.add("Mark");
		
		//Java 11
		String[] stringArray = nameList.toArray(String[]::new);
		
		for(String s : stringArray)
			System.out.println(s);
	}

}
