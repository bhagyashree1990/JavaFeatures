package com.java8.test;
@FunctionalInterface
interface TestInterface2{
	public int incrementByFive(int a);
}

public class LambdaExample2 {
	/**
	 * Java Lambda Expression with single parameter
	 */
	public static void main(String[] args) {
		TestInterface2 f = num -> num + 5;
		System.out.println(f.incrementByFive(22));
	}

}
