package com.java8.test.defaultinterfaces;

import java.util.logging.Logger;

@FunctionalInterface
interface TestInterface6{
	Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	/**
	 *  Default method in Interface
	 *  It is not mandatory to implement these methods in the implementation classes
	 */
	default void myDefaultMethod() {
		LOGGER.info("Added default method");
	}
	
	/**
	 * Static method in Interface
	 * It is similar to the default methods except that we cannot override these methods in the classes that implements these interfaces
	 */
	static void myStaticMethod() {
		LOGGER.info("Added static method");
	}
	
	void myAbstractMethod(String str);
}
public class DefaultAndStaticMethodExample implements TestInterface6{
	
	public static void main(String[] args) {
		DefaultAndStaticMethodExample example = new DefaultAndStaticMethodExample();
		example.myDefaultMethod();
		example.myAbstractMethod("Hello");
		TestInterface6.myStaticMethod();
	}

	@Override
	public void myAbstractMethod(String str) {
		LOGGER.info("Added Abtract Method Implementation "+str);
	}

}
