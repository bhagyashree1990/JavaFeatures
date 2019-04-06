package com.java8.test;
@FunctionalInterface
interface TestInterface3{
	
	/**
	 *  Default method in Interface
	 *  we do not need to implement these methods in the implementation classes mandatorily
	 */
	default void testMethod() {
		System.out.println("Added default method");
	}
	
	/**
	 * Static method in Interface
	 * Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces
	 */
	static void testAnotherMethod() {
		System.out.println("Added static method");
	}
	
	void testAbstractMethod(String str);
}
public class DefaultMethodExample implements TestInterface3{

	public static void main(String[] args) {
		DefaultMethodExample example = new DefaultMethodExample();
		example.testMethod();
		example.testAbstractMethod("Hello");
		TestInterface3.testAnotherMethod();
	}

	@Override
	public void testAbstractMethod(String str) {
		System.out.println("Test "+str);
	}

}
