package com.apple.optional;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
				
		// OLD Way //
		String bookName= getBookName();		
		System.out.println(bookName.toUpperCase());
		
		// NEW Way //		
		Optional<String> book= Optional.ofNullable(getBookName());
		if(book.isPresent())
			System.out.println(book.get());
	}

	private static String getBookName() {
		//return null;
		return "Java 8 In Action";
	}

}
