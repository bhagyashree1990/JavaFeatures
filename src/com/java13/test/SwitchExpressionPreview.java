package com.java13.test;

import java.util.Scanner;

public class SwitchExpressionPreview {
	//javac -Xlint:preview --enable-preview -source 13 src/com/java13/test/SwitchExpressionPreview.java

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		String result = switch(day.toUpperCase()) {
		case "MON","TUE","THU" : yield "veg";
		case "WED","FRI","SUN" : yield "non-veg";
		default: {
			if(day.isEmpty())
				yield "invalid day";
			else 
				yield "as per your mood";
		}
		};
		System.out.println(result);
		scanner.close();
	}	
}
