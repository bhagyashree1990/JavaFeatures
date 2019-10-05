package com.java12.test;

import java.util.stream.Stream;
import java.util.Optional;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.teeing;

import java.util.Objects;

public class TeeingCollector {

	/*
	 * in a given list of employees,
	 * if we want to find out the employee with maximum salary and minimum salary, 
	 * we can do it in single statement using teeing collector
	 */
	public static void main(String[] args) {
		Range<Integer> range = Stream.of(56700, 67600, 45200, 120000, 77600, 85000)
				.collect(teeing(
					minBy(Integer::compareTo),
					maxBy(Integer::compareTo),
					Range::ofOptional))
				.orElseThrow(() -> new IllegalStateException("Non-empty stream was empty."));
		System.out.println(range);

	}

	public static class Range<T> {
		private final T min;
		private final T max;

		private Range(T min, T max) {
			this.min = requireNonNull(min);
			this.max = requireNonNull(max);
		}

		public static <T> Range<T> of(T min, T max) {
			return new Range<T>(min, max);
		}

		public static <T> Optional<Range<T>> ofOptional(Optional<T> min, Optional<T> max) {
			if (min.isEmpty() || max.isEmpty())
				return Optional.empty();
			return Optional.of(new Range<T>(min.get(), max.get()));
		}

		public T min() {
			return min;
		}

		public T max() {
			return max;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Range<?> range = (Range<?>) o;
			return min.equals(range.min) &&
					max.equals(range.max);
		}

		@Override
		public int hashCode() {
			return Objects.hash(min, max);
		}

		@Override
		public String toString() {
			return "Range [" + min + ", " + max + ']';
		}

	}
}


