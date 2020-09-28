package com.java15.test;

import java.util.TreeMap;

public class TreeMapSpecializedMethods {

	public static void main(String[] args) {
		TreeMap<String, String> mapDemo = new TreeMap<>();
		mapDemo.put("Italy", "Rome");
		String old1 = mapDemo.put("India", "Delhi");
		String old2 = mapDemo.put("India", "Mumbai");
		
		String current1 = mapDemo.putIfAbsent("India", "Chennai");
		String current2 = mapDemo.putIfAbsent("Afghanistan", "Kabul");
		
		String current3 = mapDemo.computeIfAbsent("Uzbekistan", capital->"Tashkent");
		String current4 = mapDemo.computeIfPresent("India",(country,capital)->"Bengal");
		
		System.out.println(mapDemo);
		System.out.println(old1);
		System.out.println(old2);
		System.out.println(current1);
		System.out.println(current2);
		System.out.println(current3);
		System.out.println(current4);
	}

}
