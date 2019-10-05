package com.java12.test;

import java.util.List;

public class StringMethods {

	public static void main(String[] args) {
		indentDemo();
		transformDemo();
	}

	public static void indentDemo() {
		System.out.println("---------------");
		for(int i=5;i>0;i--) {
			String test = "*";
			System.out.print(test.indent(i));
		}
		System.out.println("---------------");
		for(int i=5;i>0;i--) {
			String test = "     *";
			System.out.print(test.indent(-i));
		}
		System.out.println("---------------");
	}
	
	public static void transformDemo() {
		List<String> names = List.of(" Amitabh","sonakshi", "rEkhA  ");
		for(String name : names) {
			System.out.println(name.transform(String::strip).transform(String::toUpperCase));
		}
	}
}
