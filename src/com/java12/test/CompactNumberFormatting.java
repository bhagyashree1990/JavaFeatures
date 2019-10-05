package com.java12.test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

	public static void main(String[] args) {
		long originalValue = 25934L;
		NumberFormat shortFormatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(shortFormatter.format(originalValue));
		shortFormatter.setMaximumFractionDigits(1);
		System.out.println(shortFormatter.format(originalValue));
		
		NumberFormat longFormatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(longFormatter.format(originalValue));
		longFormatter.setMaximumFractionDigits(2);
		System.out.println(longFormatter.format(originalValue));
		
	}

}
