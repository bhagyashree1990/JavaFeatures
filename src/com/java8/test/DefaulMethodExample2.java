package com.java8.test;
interface MyInterface1{
	default void myMethod() {
		System.out.println("Default MyInterface1");
	}
}
interface MyInterface2{
	default void myMethod() {
		System.out.println("Default MyInterface2");
	}
}

public class DefaulMethodExample2 implements MyInterface1,MyInterface2{
	
	//Implementation of duplicate default method
	public void myMethod() {
		MyInterface2.super.myMethod();
	}
	
	public static void main(String[] args) {
		DefaulMethodExample2 example=new DefaulMethodExample2();
		example.myMethod();
	}

}
