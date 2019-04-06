package com.java8.test;

import java.util.function.BiFunction;

class Multiplication{
	public static int multiply(int i1,int i2) {
		return i1*i2;
	}
}

public class MethodReferenceExample1 {

	/**
	 * Method reference to a static method of a class
	 */
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> m = Multiplication::multiply;
		int product = m.apply(11, 5);
		System.out.println(product);
	}

}
