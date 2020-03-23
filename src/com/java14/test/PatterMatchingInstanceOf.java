package com.java14.test;

public class PatterMatchingInstanceOf {

	public static void main(String[] args) {
		Object objA = new  A();
		if(objA instanceof A a)
			System.out.println(a.numA);
		
		objA= new B();
		if(objA instanceof B b && b.stringB.length()>0)
			System.out.println(b.stringB);
	}
	
	

}
class A{
	A(){
		numA=10;
	}
	int numA;
}

class B extends A{
	B(){
		stringB="Hello";
	}
	String stringB;
}