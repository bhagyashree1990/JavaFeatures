package com.java9.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class FactoryMethodsCollectionExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		/**
		 * Immutable : 
		 * We cannot add/modify/delete their elements
		 * If we try to perform add/delete operations we get UnsupportedOperationException
		 * They don't allow null elements
		 * If we try to create with null elements we get NullPointerException
		 */
		List<String> immutableEmptyList = List.of();
		LOGGER.info("Empty List Example: "+immutableEmptyList);
		List<String> immutableList = List.of("ABC","PQR","MNO");
		LOGGER.info("Non-Empty List Example: "+immutableList);

		
		Set<String> immutableEmptySet = Set.of();
		LOGGER.info("Empty Set Example: "+immutableEmptySet);
		Set<String> immutableSet = Set.of("MUMBAI","PARIS","LONDON");
		LOGGER.info("Non-Empty Set Example: "+immutableSet);
		
		
		Map<String, Integer> immutableEmptyMap = Map.of();
		LOGGER.info("Empty Map  Example: "+immutableEmptyMap);
		Map<String, Integer> immutableMap = Map.of("ABC",10,"PQR",11,"MNO",12);
		LOGGER.info("Non-Empty Map  Example: "+immutableMap);
	}

}
