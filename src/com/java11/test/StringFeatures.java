package com.java11.test;

public class StringFeatures {
	public static void main(String[] args) {
		
	}
	
	//Got a multiline string? Want to do something with every line? 
	public static void linesTest() {
		String multiLineString = "This is l1\n"+
				"This is l2\n"+
				"This is l3\n"+
				"This is l4\n";
		multiLineString.lines().map(line->line).forEach(System.out::println);
	}
	
	public static void blankTest() {
		String test1="     ";
		String test2="";
		System.out.println(test1.isBlank()+"\t"+test1.isEmpty());
		System.out.println(test2.isBlank()+"\t"+test2.isEmpty());
	}
	
	public static void repeatTest() {
		String test = "Abc";
		System.out.println(test.repeat(5));
	}
	
	public static void stripVsTrim() {
		String test = "   TEST  ";
		System.out.println(test.trim());
		System.out.println(test.strip());
	}
}
