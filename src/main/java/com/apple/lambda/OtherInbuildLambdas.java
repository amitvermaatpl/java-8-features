package com.apple.lambda;

import java.util.function.BiFunction;

/*
 * REFER: http://www.java2s.com/Tutorials/Java_Lambda/java.util.function/
 * 
 * http://www.java2s.com/Tutorials/Java_Lambda/java.util.function/BiFunction/BiFunction_example.htm
 */
public class OtherInbuildLambdas {

	public static void main(String[] args) {
		// Page53: Supplier, UnaryOperator, BiPredicate, BiConsumer, BiFunction //
		
		// *** LAMBDA: BiFunction= accepts T,U and return R *** //
		BiFunction<Integer, Integer,Integer> addition = (x, y ) -> x + y;
		
		System.out.println("Addition result= "+ addition.apply(2, 6));
		
		// ********************* LAMBDA: ******************* //
		
		
		// ********************* LAMBDA: ******************* //
		
		
		// ********************* LAMBDA: ******************* //

	}

}
