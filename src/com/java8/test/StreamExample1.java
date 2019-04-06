package com.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		testStream3();
	}

	//Find strings whose length is less than 5
	public static void testStream1() {
		List<String> list = new ArrayList<String>();
		list.add("Steve");
		list.add("Jeff");
		list.add("Mark");
		list.add("Larry");
		list.add("Bill");
	
		/*
		 * the stream() method returns a stream of all the names, 
		 * the filter() method returns another stream of names with length less than 6, 
		 * the count() method reduces this stream to the result
		 */
		long count = list.stream().filter(name->name.length()<5).count();
		System.out.println(count);
	}
	
	//Iterating and displaying selected integers
	public static void testStream2() {
		Stream.iterate(1, count->count+1)
			.filter(number->number%3==0)
			.limit(6)
			.forEach(System.out::println);
	}
	
	public static void testStream3() {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> sqaures = numList.stream().map(n->n*n).collect(Collectors.toList());
		sqaures.forEach(num->System.out.println(num));
	}
}
