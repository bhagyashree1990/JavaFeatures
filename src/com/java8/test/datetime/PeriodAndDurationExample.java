package com.java8.test.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodAndDurationExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(1990, Month.APRIL,1);
		Period gap = Period.between(date1, date2);
		System.out.println(gap);
		
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(10, 0, 0);
		Duration durationGap = Duration.between(time1, time2);
		System.out.println(durationGap);
	}

}
