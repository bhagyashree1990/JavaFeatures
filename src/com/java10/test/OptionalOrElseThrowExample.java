package com.java10.test;

import java.util.stream.Stream;

public class OptionalOrElseThrowExample {

	public static void main(String[] args) {
		String result1 = Stream.of("out","in","closed")
				.filter(s->Character.isAlphabetic(s.charAt(0)))
				.findAny()
				.orElseThrow();
		System.out.println(result1);
		
		String result = Stream.of("out","in","closed")
				.filter(s->Character.isDigit(s.charAt(0)))
				.findAny()
				.orElseThrow();
		System.out.println(result);
		
	}

}
