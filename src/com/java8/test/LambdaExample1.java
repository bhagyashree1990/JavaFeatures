package com.java8.test;

//An interface with only single abstract method is called functional interface
//they are also known as Single Abstract Method interfaces (SAM Interfaces)
@FunctionalInterface
interface TestInterface1{
	public String sayHello();
}

public class LambdaExample1 {
	/**
	 * Java Lambda Expression with no parameter 	 
	 */
	
	public static void main(String[] args) {
		TestInterface1 msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}
