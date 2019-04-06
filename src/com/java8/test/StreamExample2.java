package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		testStream5();
	}

	//Stream Collectors groupingBy 
	public static void testStream4() {
		List<Integer> numList = Arrays.asList(10,20,30,20,40,50,10);
		Map<Integer, Long> map = numList.stream().collect(
				Collectors.groupingBy(
						Function.identity(),Collectors.counting()
						)
				);
		System.out.println(map);
	}
	
	//Stream Collectors averagingInt
	public static void testStream5() {
		List<Integer> numList = Arrays.asList(22,18,22,23,18);
		Double average = numList.stream().collect(Collectors.averagingInt(num->num));
		System.out.println(average);
	}
}
