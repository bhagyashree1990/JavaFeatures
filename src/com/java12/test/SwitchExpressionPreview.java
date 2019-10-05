package com.java12.test;

import java.util.Scanner;

public class SwitchExpressionPreview {
	//javac -Xlint:preview --enable-preview -source 12 src/com/java12/test/SwitchExpressions.java

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		String result = switch(day) {
		case "MON","TUE","THU" -> "veg";
		case "WED","FRI","SUN" -> "non-veg";
		default-> {
			if(day.isEmpty())
				break "invalid day";
			else 
				break "as per your mood";
		}
		};
		System.out.println(result);
		scanner.close();
	}	
}
