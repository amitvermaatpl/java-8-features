package com.apple.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 *  Functional Interface List:
 *  https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */
public class LambdaExercise {

	public static void main(String[] args) {
		// PERFORM Exercise on : List of Person Object //
		
		List<Person> persons = Arrays.asList(
					new Person("Raj","Singh",54),
					new Person("Amit","Verma",34),
					new Person("Shub","Soni",28),
					new Person("Atul","Singh",31),
					new Person("Bharat","Verma",42)
				);		
		System.out.println("Persons List:= "+ persons);
		
		// TASK-1: Sort the list by last names //
		Collections.sort(persons, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		
		// TASK-2: Create a method that prints all elements in the list //
		printElements((p)-> System.out.println(p), persons);		
		//printElementsWithCondition(p-> true, persons); // Print all elements with same method 
		
		System.out.println("=============================="); 
		
		// TASK-3: Create a method that print all the elements that have name starts with A //
		printElementsWithCondition((p)->p.getFname().startsWith("A"), persons);
		printElementsWithCondition((p)->p.getFname().startsWith("S"), persons);
		
		// TASK-4: Create a method that print all the elements that have name length more than 3 //
		printElementsWithCondition(p -> p.getFname().length()>3, persons);
	}

	private static void printElements(Consumer<Person> l, List<Person> persons) {
		for(Person p: persons) {
			l.accept(p);	
		}			
	}
	private static void printElementsWithCondition(Predicate<Person> predicate, List<Person> persons) {
		for(Person p: persons) {
			if(predicate.test(p))
				System.out.println(p); // Remove this behavior and Pass it from method, Hint: Consumer Interface //
		}			
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