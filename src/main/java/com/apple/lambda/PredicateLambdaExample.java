package com.apple.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambdaExample {
	
	// Predicate: boolean test(T t) //
	public static void main(String[] args) {
		List<String> names= Arrays.asList("Aman","Raman","Suman","Pawan","Dhawan");
		
		Predicate<String> shortName = (n)-> n.length()<5;
		List<String> shortNames= filterName(names, shortName);
		
		System.out.println(shortNames);

		Predicate<String> longName = (n)-> n.length()>4;
		List<String> longNames= filterName(names, longName);
		
		System.out.println(longNames);
	}

	private static List<String> filterName(List<String> names, Predicate<String> namesPredicate) {
		List<String> filteredNames = new ArrayList<String>();
		for(String name:names){
			if(namesPredicate.test(name))
				filteredNames.add(name);
		}
		return filteredNames;
	}

}
