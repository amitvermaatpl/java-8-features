package com.apple.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaHello {
	public static void main(String[] args) {
		// *********  Simple Lambda () -> {} ********* //
		StringConcat s= (str1, str2) -> str1+str2;
		System.out.println(s.concatString("Hello", "World"));
				
		// Using in-build java functional interface, like- Predicate, Consumer and Supplier etc. //
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));
        
        // ********* Calling default method of interface ********* //
 		s.move();
 		
 		// ********* Calling Static method of interface ********* //
 		StringConcat.newMove();
 		
 		// ********* //
 		boolean result= LambdaUtils.isALongWord.test("");
 		System.out.println(result);
	}	
}

@FunctionalInterface // can have any number of default and static methods, but only one abstract method. //
interface StringConcat{
	public String concatString(String s1, String s2);
	
	default void move(){
        System.out.println("I am moving");
    }
	static void newMove(){
		System.out.println("I am flying");
	}
}
