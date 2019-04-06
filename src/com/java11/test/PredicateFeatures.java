package com.java11.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class PredicateFeatures {

	public static void main(String[] args) {
		//predicateNotTest();
		predicateAsMatchPredicateTest();
	}

	public static void predicateNotTest() {
		Stream.of("a","b"," ","c").filter(Predicate.not(String::isBlank)).forEach(System.out::println);
	}
	
	/**
	 * asPredicate  : checks whether the string or any substring matches this pattern 
	 * asMatchPredicate : if the entire string matches this pattern 
	 */
	public static void predicateAsMatchPredicateTest() {
		var predicate = Pattern.compile("dog",Pattern.CASE_INSENSITIVE).asMatchPredicate(); //asPredicate()
		List<String> nameList = Arrays.asList("dog","DOG","Dog","Doggy","dOg");
		nameList.forEach(name->{
			if(predicate.test(name))
				System.out.println(name+" matches");
			else
				System.out.println(name+" does not match");
		});
	}
}
