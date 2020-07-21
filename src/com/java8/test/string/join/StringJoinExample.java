package com.java8.test.string.join;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Logger;

public class StringJoinExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		
		
		List<String> cities=Arrays.asList("Tokyo","Moscow","Berlin","Nairobi","Rio","Denver","Helsinki","Oslo");
		String join1 = String.join(",", cities);
		LOGGER.info("String: Join: "+join1);
	
		StringJoiner stringJoiner=new StringJoiner("->","[","]");
		stringJoiner.add("Node1");
		stringJoiner.add("Node2");
		stringJoiner.add("Node3");
		stringJoiner.add("Node4");
		LOGGER.info("StringJoiner : "+stringJoiner.toString());
	}
	
	
}
