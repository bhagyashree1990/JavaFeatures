package com.java11.test;

import java.util.ArrayList;
import java.util.List;

public class OptionalIsEmptyExample {

	public static void main(String[] args) {
		List<String> nameList  = new ArrayList<String>();
		nameList.add("Larry");
		nameList.add("Jeff");
		nameList.add("Bill");
		nameList.add("Steve");
		nameList.add("Mark");
		
		boolean notInList = nameList.stream().filter(name->name.equals("Bhagyashree")).findAny().isEmpty();
		System.out.println(notInList);
	}

}
