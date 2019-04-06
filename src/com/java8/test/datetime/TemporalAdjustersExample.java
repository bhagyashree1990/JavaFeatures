package com.java8.test.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		//First Day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDay);
		//Next SAT
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(nextSaturday);
	}

}
