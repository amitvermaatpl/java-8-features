package com.apple.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaUtils {
	static Predicate<String> isALongWord = t -> t.length() > 10;
	
	public static void main(String [] args) {
		List<Person> persons = Arrays.asList(
				new Person("Raj","Singh",54),
				new Person("Amit","Verma",34),
				new Person("Shub","Soni",28),
				new Person("Atul","Singh",31),
				new Person("Bharat","Verma",42)
			);		
		
		System.out.println("### Using for loop: External Iterator ###"); 
		for(int i=0; i<persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		System.out.println("### Using for-in loop: External Iterator ###");
		for(Person p: persons) {
			System.out.println(p);
		}
		// executes in parallel: print two values using 1st core and rest values using 2nd core //
		System.out.println("### Using for-each loop: Internal Iterator ###"); 
		persons.forEach(System.out::println); // equivalent to: p -> System.out.println(p)
	}
}
