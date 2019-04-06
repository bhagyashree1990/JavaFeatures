package com.java8.test;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		testExample1();
	}

	public static void testExample1() {
		StringJoiner stringJoiner=new StringJoiner("->","[","]");
		stringJoiner.add("Node1");
		stringJoiner.add("Node2");
		stringJoiner.add("Node3");
		stringJoiner.add("Node4");
		System.out.println(stringJoiner);
	}
}
