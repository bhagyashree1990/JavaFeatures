package com.java8.test.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsExample {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Date:\t"+date);
		LocalDate year=date.plus(2, ChronoUnit.YEARS);
		System.out.println("2Yr+ :\t"+year);
		LocalDate week=date.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next Week:\t"+week);
	}

}
