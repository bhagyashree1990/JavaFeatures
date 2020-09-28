package com.java15.test;

public class RecordsPreview {
	public static void main(String[] args) {
		Point point=new Point(12, 13);
		System.out.println(point.x());
		System.out.println(point.y());
		System.out.println(point);
		
		Point anotherPoint=new Point(12, 13);
		System.out.println("Equality check: "+point.equals(anotherPoint));
		
		Range range1 = new Range(1, 20);
		System.out.println(range1);
	}
}

record Point(int x,int y) {
	
}

record Range(int low,int high) {
	//Concise Constructor
	public Range{
		if(low>=high)
			throw new IllegalArgumentException("Bad Range: (%d, %d)".formatted(low,high));
	}
}