package com.java14.test;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			String day=scanner.next();
			int num= switch(day) {
				case "JAN","MAR","MAY","JUL","AUG","OCT","DEC" -> 31;
				default-> 30;
			};
			System.out.println(num);
		}

	}

}
