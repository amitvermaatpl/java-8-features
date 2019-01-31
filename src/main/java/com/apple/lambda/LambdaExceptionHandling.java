package com.apple.lambda;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {

	public static void main(String[] args) {
		// Write a function that process some array //
		int [] numbers= {1,4,7,8,9};
		int key=0;
		
		// BAD Way //
		processForExceptionHandling(numbers, key, (v, k)-> {
			try {
				System.out.println(v/k);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		});
		
		// GOOD Way //
		processForExceptionHandling(numbers, key, wrapperLambda( (v, k)-> System.out.println(v/k) ));
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		//return (v,k)-> System.out.println(v+k);
		//return (v,k) -> {consumer.accept(v, k);}; // executes what passed in //
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println("Exception in wrapper lambda:= "+ e.getMessage());
			}
			
		};
	}

	private static void processForExceptionHandling(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int v: numbers) {
			consumer.accept(v, key);
		}
	}
}
