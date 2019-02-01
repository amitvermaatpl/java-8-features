package com.apple.stream;

import java.util.Arrays;
import java.util.List;

//CONCEPT: Collection of 6 Cars need some action:- Paint, fix the engine, fix the tires //
public class HelloStream {
	// WAY-1: Person1(Painter) goes to each car for paint and same for rest of the cases: DRAWBACK // Iterating over the car 3 times: not efficient //
	public static void main(String[] args) {		

		// ASSEMBLEY LINE: Basically we want some actions on our collection of objects(CAR etc) //		
		List<Person> persons = Arrays.asList(
				new Person("Raj","Singh",54),
				new Person("Amit","Verma",34),
				new Person("Shub","Soni",28),
				new Person("Atul","Singh",31),
				new Person("Bharat","Verma",42)
				);	

		// Give list of people, first name starts with 'A' and print them //
		for(Person p: persons) {
			if(p.getFname().startsWith("A"))
				System.out.println(p);
		}

		// By Using Streams: persons.stream()= arrange the persons in assembley line //		
		persons.stream()
		.forEach(p->System.out.println("=> "+p));  // It Prints All

		persons.stream()
		.filter(p-> p.getFname().startsWith("S"))
		.forEach(p->System.out.println(p)); 

		long count=persons.parallelStream()       // Few persons goes to 1st core assembly line and few goes to next core assembley line //
		.filter(p-> p.getLname().startsWith("S"))
		.count();
		
		System.out.println(count);
	}
}	

class Person{
	private String fname;
	private String lname;
	private int age;

	Person(String fname, String lname, int age){
		this.fname= fname;
		this.lname= lname;
		this.age= age;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}


