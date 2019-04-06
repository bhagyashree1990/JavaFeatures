package com.java8.test.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	/**
	 * Simplified date-time API with no complexity of timezone handling
	 */
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = dateTime.format(format);
		System.out.println(formattedDateTime);
		
		//Fetch month
		Month month = dateTime.getMonth();
		System.out.println(month+"\t"+month.getValue());
		
		//Fetch day of month
		int day = dateTime.getDayOfMonth();
		System.out.println("Day :"+day);
	}

}
