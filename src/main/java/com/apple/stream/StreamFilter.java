package com.apple.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {    
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");		names.add("Negan");
		names.add("Amit");		names.add("Steve");
			
		// Count Strings with length less than 6 //
		long count = names.stream()
					.filter(str->str.length()<6)
					.count();
		
		System.out.println("There are "+count+" strings with length less than 6");
		
		List<String> nameList = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longnames = nameList.stream()  
                .filter(str -> str.length() > 6 && str.length() < 8) // Multiple conditions //
                .collect(Collectors.toList());  

        longnames.forEach(System.out::println);  

	   }  
}
