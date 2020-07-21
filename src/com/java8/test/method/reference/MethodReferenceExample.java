package com.java8.test.method.reference;

import java.util.function.IntBinaryOperator;
import java.util.logging.Logger;

@FunctionalInterface
interface TestInterface4{
	void display();
}

@FunctionalInterface
interface TestInterface5{
	void display(String message);
}

class Sample{
	
	public Sample() {
	}
	
	public Sample(String test) {
		LOGGER.info("Method Reference : CONSTRUCTOR : "+test);
	}
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void myMethod() {
		LOGGER.info("Method Reference : INSTANCE METHOD");
	}
	
	public static int multiply(int i1,int i2) {
		return i1*i2;
	}
}

public class MethodReferenceExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		/**
		 * Method reference to an instance method of a class
		 */
		Sample sample=new Sample();
		TestInterface4 reference = sample::myMethod;
		reference.display();
		
		/**
		 * Method reference to a static method of a class
		 */
		IntBinaryOperator m = Sample::multiply;
		int product = m.applyAsInt(11, 5);
		LOGGER.info("Method Reference : "+product);
		
		/**
		 * Method reference to a constructor of a class
		 */
		TestInterface5 reference2 = Sample::new;
		reference2.display("Welcome");
	}

}
