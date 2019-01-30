package com.apple.lambda;

import java.util.Arrays;

public class LambdaSort {
	public static void main(String [] args){
		Dog d1 = new Dog("Max", 2, 50);
		Dog d2 = new Dog("Rocky", 1, 30);
		Dog d3 = new Dog("Bear", 3, 40);
 
		Dog[] dogArray = { d1, d2, d3 };
		printDogs(dogArray);
	
		// Sort dogs by name: Comparator Lambda //
		Arrays.sort(dogArray,  (Dog m, Dog n) -> m.getName().compareTo(n.getName()));
		printDogs(dogArray);
		
		// Sort dogs by weight //
		Arrays.sort(dogArray, (Dog m, Dog n) -> m.getWeight() - n.getWeight()  );
		printDogs(dogArray);
		
		// *** MethodReference: Sort by name *** //
		Arrays.sort(dogArray, Dog::nameCompare);
		printDogs(dogArray);
	}
	
	public static void printDogs(Dog[] dogs) {
		System.out.println("--Dog List--");
		for (Dog d : dogs)
			System.out.print(d);
		
		// ForEach: Consumer, void accept(T t) //
		// Arrays.asList(dogs).stream().forEach((d)-> System.out.println("-> "+d));
	}
}
class Dog {
	String name;
	int height;
	int weight;
 
	public Dog(String n, int s, int w) {
		this.name = n;
		this.height = s;
		this.weight = w;
	}
 
	public static int nameCompare(Dog a1, Dog a2) {
	    return a1.name.compareTo(a2.name);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String toString() {
		return getName() + ": size=" + getHeight() + " weight=" + getWeight()
				+ " \n";
	}
	
}
