package com.java8.test.functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.logging.Logger;

public class FunctionalInterfaceExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		functions();
		suppliers();
		consumers();
		predicates();
	}
	
	public static void functions() {
		Function<String, Integer> computeLengthFunction = s-> s.length();
		LOGGER.info("FUNCTION: Compute Length : "+computeLengthFunction.apply("Test"));
		
		
		/**
		 * Primitive Function Specializations: IntFunction, LongFunction, DoubleFunction
		 * Arguments are of specified type, return type is parameterized
		 */
		IntFunction<Integer> computeCube = n->n*n*n;
		LOGGER.info("FUNCTION: Compute Cube "+computeCube.apply(3));

		/**
		 * Primitive Function Specializations: ToIntFunction, ToLongFunction, ToDoubleFunction
		 * Return type is of specified type, arguments are parameterized 
		 */
		ToIntFunction<Integer> computeSquare = n->n*n;
		LOGGER.info("FUNCTION: Compute Square "+computeSquare.applyAsInt(3));
		
		
		UnaryOperator<Integer> computeDouble = n->n*2;
		LOGGER.info("FUNCTION: Compute Double "+computeDouble.apply(3));
		
		/**
		 * BiFunction
		 */
		BiFunction<String, String, Boolean> searchOccurence = (s1,s2)->s1.contains(s2);
		LOGGER.info("BIFUNCTION: Search Occurence "+searchOccurence.apply("HelloWorld", "world"));
		
		BinaryOperator<Integer> computePower = (x,n) -> {
			Integer result = 1;
			for(int i=1;i<=n;i++)
				result *= x;
			return result;
		};
		LOGGER.info("FUNCTION: Compute Power "+computePower.apply(2, 5));
	}

	public static void suppliers() {
		Supplier<Double> doubleSupplier = () -> Math.random();
		LOGGER.info("SUPPLIER: "+doubleSupplier.get());
	}
	
	public static void consumers() {
		Consumer<String> consumer = name -> LOGGER.info("COSNUMER: "+name);
		consumer.accept("John Doe");
	}
	
	public static void predicates() {
		Predicate<String> nameStartsWithA = s->s.startsWith("A");
		Predicate<String> nameDoesNotStartWithA = nameStartsWithA.negate();
		LOGGER.info("PREDICATE : "+nameStartsWithA.test("Amanda"));
		LOGGER.info("PREDICATE : Negate: "+nameDoesNotStartWithA.test("John"));
	}
}
