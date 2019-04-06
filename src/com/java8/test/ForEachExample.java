package com.java8.test;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	/**
	 * Iterating collections using foreach loop
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Japan");
		list.add("China");
		list.add("USA");
		list.forEach(s->System.out.println(s));
	}

}
