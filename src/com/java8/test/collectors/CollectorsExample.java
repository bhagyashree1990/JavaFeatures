package com.java8.test.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CollectorsExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		List<String> names =  Arrays.asList("Alice","Jane","John","Samantha","Alice","John");
		Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
		LOGGER.info("Collectors: toSet: "+uniqueNames);
		
		//Handle Duplicate Keys
		Map<String, Integer> nameLengthMap = names.stream().collect(
					Collectors.toMap(
							String::toString, 
							String::length,
							(existing,replacement)->existing+replacement));
		LOGGER.info("Collectors: toMap: "+nameLengthMap);
		
		String result= uniqueNames.stream().collect(Collectors.joining("-"));
		LOGGER.info("Collectors: joining: "+result);
		
		Long count = uniqueNames.stream().collect(Collectors.counting());
		LOGGER.info("Collectors: counting: "+count);
		
		Map<String, Long> nameCountMap = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		LOGGER.info("Collectors: groupingBy: "+nameCountMap);
		
		Map<Boolean,List<String>> nameMap =	names.stream().collect(Collectors.partitioningBy(s->s.startsWith("J")));
		LOGGER.info("Collectors: partitioningBy: "+nameMap);
	}
}
