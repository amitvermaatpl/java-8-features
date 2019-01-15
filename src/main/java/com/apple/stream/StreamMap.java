package com.apple.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
	/*
	 * MAP: applies a function on each element of stream & stores 
	 *      the value returned by the function into a new Stream.
	 */
	public static void main(String[] args) {

    	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
        		.map(n -> n * n)
        		.collect(Collectors.toList());
        System.out.println(squares);        

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
               
        List<Integer> numbers = Stream.of(evens, odds, primes)
                       .flatMap(list -> list.stream())
                       .collect(Collectors.toList());
               
        System.out.println("flattend list: " + numbers);
    }
}
