package com.apple.lambda;

import java.util.function.Consumer;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// Example-1 : Thread //
		Thread worker1 = new Thread(() -> System.out.println("Print"));
		worker1.start();
		
		Thread worker2 = new Thread(MethodReferenceExample::printMessage);
		worker2.start();	
		
		// Example-2: Consumer //
		int [] numbers= {2,4,5,7,8,9};
		doProcess(numbers, p-> System.out.println("=> "+p));		
		doProcess(numbers, System.out::println); // equivalent to () ->System.out.println(p) //
	}

	private static void doProcess(int[] numbers, Consumer<Integer> c) {
		for(int n: numbers) {
			c.accept(n);			
		}		
	}
	
	private static void printMessage() {
		System.out.println("Printing...");
	}

}
