package com.java8.test.lambda;

import java.util.logging.Logger;

//An interface with only single abstract method is called functional interface
//they are also known as Single Abstract Method interfaces (SAM Interfaces)
@FunctionalInterface
interface TestInterface1{
	public String sayHello();
}

@FunctionalInterface
interface TestInterface2{
	public int incrementByFive(int a);
}

@FunctionalInterface
interface TestInterface3{
	public int find(String s1,String s2);
}

public class LambdaExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		
		/**
		 * Java Lambda Expression with no parameter 	 
		 */
		TestInterface1 msg = () -> "Hello";
		LOGGER.info("Java Lambda Expression: "+msg.sayHello());
		
		/**
		 * Java Lambda Expression with single parameter
		 */
		TestInterface2 f = num -> num + 5;
		LOGGER.info("Java Lambda Expression: "+f.incrementByFive(22));
		
		/**
		 * Java Lambda Expression with multiple parameters
		 */
		TestInterface3 finder = (s1,s2) -> s1.indexOf(s2);
		LOGGER.info("Java Lambda Expression: "+finder.find("Good Morning", "Morning"));
	}
	
	
}
