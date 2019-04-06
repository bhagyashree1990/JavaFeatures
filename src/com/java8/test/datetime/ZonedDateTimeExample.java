package com.java8.test.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime.format(format));
		
		ZoneId usZone = ZoneId.of("EST5EDT");
		ZonedDateTime usZoneDateTime = zonedDateTime.withZoneSameInstant(usZone);
		System.out.println(usZoneDateTime.format(format));
	}

}
