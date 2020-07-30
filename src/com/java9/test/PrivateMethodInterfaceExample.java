package com.java9.test;

import java.util.logging.Level;
import java.util.logging.Logger;

interface TestInterface{
	Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * Moved redundant code to common private method 
	 * @param level
	 * @param message
	 */
	private void log(Level level,String message) {
		LOGGER.log(level,"TestInterface: "+message);
	}
	
	default void displayInfo(String message) {
		log(Level.INFO, message);
	}
	
	default void displayWarn(String message) {
		log(Level.WARNING, message);
	}
}
public class PrivateMethodInterfaceExample implements TestInterface{
	public static void main(String[] args) {
		PrivateMethodInterfaceExample example=new PrivateMethodInterfaceExample();
		example.displayInfo("Calling Info");
		example.displayWarn("Calling Warn");
	}
}
