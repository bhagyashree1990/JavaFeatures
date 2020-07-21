package com.java8.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		Stream<String> cities = Stream.of("Mumbai","Tokyo","London");
		cities.forEach(city->LOGGER.info("City:"+city));
		
		Stream<Integer> generateNumbers = Stream.generate(()-> 5).limit(10);
		LOGGER.info("Stream: generate: "+generateNumbers.collect(Collectors.toList()));
		
		Stream<Integer> iterateNumber = Stream.iterate(20, n->n+5).limit(10);
		LOGGER.info("Stream: iterate: "+iterateNumber.collect(Collectors.toList()));
		
		
		/**
		 * Stream of Primitives
		 */
		IntStream intStream = IntStream.range(1, 5);
		intStream.forEach(n->LOGGER.info("Range :"+n));
		
		IntStream intStream2 = IntStream.rangeClosed(1, 5);
		intStream2.forEach(n->LOGGER.info("RangeClosed :"+n));
		
		IntStream intStream3 = Arrays.stream(new int[] {200,33,74,51});
		LOGGER.info("Stream: Min: "+intStream3.min());
//		LOGGER.info("Stream: Max: "+intStream3.max());
//		LOGGER.info("Stream: Count: "+intStream3.count());
//		LOGGER.info("Stream: Sum: "+intStream3.sum());
//		LOGGER.info("Stream: Average: "+intStream3.average());
		
		
		List<Integer> numberList = Arrays.asList(10,10,20,20,30,40,50,50,50);
		Stream<Integer> uniqueNumbers =	numberList.stream().distinct();
		Optional<Integer> maxNumber = uniqueNumbers.reduce((n1,n2)->n1>n2?n1:n2);
		LOGGER.info("Stream: Reduce: "+maxNumber);
		
		
		Stream<Integer> evenNumbers = Stream.iterate(20, n->n+1).limit(10);
		LOGGER.info("Stream: Filter: "+evenNumbers.filter(n->n%4==0).collect(Collectors.toList()));
		
		Stream<String> countries=Stream.of("India","Pakistan","England","Australia");
		Stream<String> countryCode = countries.map(country->country.substring(0, 3).toUpperCase());
		LOGGER.info("Stream: Map: "+countryCode.collect(Collectors.toList()));
	}
}
