package com.apple.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExercise {

	public static void main(String[] args) {
		
	     // EXERCISE-1: Count empty strings //
	     List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	     System.out.println("List: " +strings);
	     long count = getCountEmptyStringUsingJava7(strings);
	      
	     // Java 8 
		 count = strings.stream().filter(string->string.isEmpty()).count();
		  
		 // EXERCISE-2: Eliminate empty string and join using comma. //
		 String mergedString = getMergedStringUsingJava7(strings,", ");
	     System.out.println("Merged String: " + mergedString);
	     
	     // JAVA 8
	     mergedString= strings.stream().filter(string-> !string.isEmpty()).collect(Collectors.joining(", "));
	     
	     // EXERCISE-3: get list of square of distinct numbers
	     List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	     List<Integer> squaresList = getSquares(numbers);
	     System.out.println("Squares List: " + squaresList);
	     
	     // JAVA 8
	     squaresList= numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
	     
	     // EXERCISE-4: print ten random numbers //
	     Random random = new Random();
			
	     for(int i = 0; i < 10; i++) {
	         //System.out.println(random.nextInt());
	     }
	      
	     // JAVA 8
	     random.ints().limit(10).sorted().forEach(System.out::println);
	      
	     //JAVA 8: parallel processing
	     count = strings.parallelStream().filter(string -> string.isEmpty()).count();
	     System.out.println("Empty Strings: " + count);
	     
	     // JAVA 8: STATISTICS
	     List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
	     IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
			
	     System.out.println("Highest number in List : " + stats.getMax());
	     System.out.println("Lowest number in List : " + stats.getMin());
	     System.out.println("Sum of all numbers : " + stats.getSum());
	     System.out.println("Average of all numbers : " + stats.getAverage());
	     System.out.println("Random Numbers: ");
			
	}
	
	private static List<Integer> getSquares(List<Integer> numbers) {
		List<Integer> squaresList = new ArrayList<>();
		
		for(Integer number: numbers) {
	         Integer square = new Integer(number.intValue() * number.intValue());
				
	         if(!squaresList.contains(square)) {
	            squaresList.add(square);
	         }
	      }
	      return squaresList;
	}

	private static int getCountEmptyStringUsingJava7(List<String> strings) {
	      int count = 0;
	      for(String string: strings) {			
	         if(string.isEmpty()) {
	            count++;
	         }
	      }
	      return count;
    }
	
	private static String getMergedStringUsingJava7(List<String> strings, String separator) {
	      StringBuilder stringBuilder = new StringBuilder();
			
	      for(String string: strings) {			
	         if(!string.isEmpty()) {
	            stringBuilder.append(string);
	            stringBuilder.append(separator);
	         }
	      }
	      String mergedString = stringBuilder.toString();
	      return mergedString.substring(0, mergedString.length()-2);
	   }

}
