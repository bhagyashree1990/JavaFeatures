package com.java13.test;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println("Hello %s!".formatted("World"));
		var s1 = "    foo\n   bar";
		System.out.println(s1.stripIndent());
		String s2="Test\r\nDemo";
		System.out.println(s2.translateEscapes());
	}

	
}
