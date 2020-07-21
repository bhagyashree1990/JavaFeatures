package com.java8.test.optional;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		String[] str=new String[10];
		//str[9] = "HelloWorld";
		
		//Method 1
		Optional<String> optionalString = Optional.ofNullable(str[9]);
		if(optionalString.isPresent()) {
			String str2 = optionalString.get().substring(2,5);
			System.out.println(str2);
		}else {
			System.out.println("Empty String");
		}
		
		//Method 2
		optionalString.ifPresent(s-> System.out.println(s.substring(2, 5)));
		System.out.println(optionalString.orElse("Empty String"));
	}

}
