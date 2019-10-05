package com.java12.test;

import java.util.Scanner;

public class SwitchExpressionPreview {
	//javac -Xlint:preview --enable-preview -source 12 src/com/java12/test/SwitchExpressionPreview.java

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		String result = switch(day.toUpperCase()) {
		case "MON","TUE","THU" -> "veg";
		case "WED","FRI","SUN" -> "non-veg";
		default-> "as per your mood"; /*{		//TODO : UNCOMMENTING ON JAVA-13 gives COMPILATION error
			if(day.isEmpty())
				break "invalid day";
			else 
				break "as per your mood";
		}*/
		};
		System.out.println(result);
		scanner.close();
	}	
}
