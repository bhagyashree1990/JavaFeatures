package com.java9.test;

import java.util.List;
import java.util.Map;

public class FactoryMethodsCollectionExample {

	public static void main(String[] args) {
		List<String> immutableEmptyList = List.of();
		System.out.println("Empty List Example: "+immutableEmptyList);
		List<String> immutableList = List.of("ABC","PQR","MNO");
		System.out.println("Non-Empty List Example: "+immutableList);
		
		Map<String, Integer> immutableEmptyMap = Map.of();
		System.out.println("Empty Map  Example: "+immutableEmptyMap);
		Map<String, Integer> immutableMap = Map.of("ABC",10,"PQR",11,"MNO",12);
		System.out.println("Non-Empty Map  Example: "+immutableMap);
	}

}
