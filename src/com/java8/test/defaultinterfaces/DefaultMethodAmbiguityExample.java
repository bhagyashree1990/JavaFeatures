package com.java8.test.defaultinterfaces;

import java.util.logging.Logger;

interface MyInterface1{
	Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	default void myMethod() {
		LOGGER.info("Default MyInterface1");
	}
}
interface MyInterface2{
	Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	default void myMethod() {
		LOGGER.info("Default MyInterface2");
	}
}

public class DefaultMethodAmbiguityExample implements MyInterface1,MyInterface2{
	
	//Implementation of duplicate default method
	@Override
	public void myMethod() {
		MyInterface2.super.myMethod();
	}
	
	public static void main(String[] args) {
		DefaultMethodAmbiguityExample example=new DefaultMethodAmbiguityExample();
		example.myMethod();
	}

}
