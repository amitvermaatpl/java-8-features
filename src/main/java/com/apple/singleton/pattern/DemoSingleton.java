package com.apple.singleton.pattern;

public class DemoSingleton {
	public static void main(String[] args) {
		MySingleton obj= MySingleton.INSTANCE;
		obj.doSomething();
		System.out.println(obj.getSomething()); // Try to read/get property -> something //
	}

}

enum MySingleton {
	INSTANCE;
	
	public void doSomething() { System.out.println("Doing Something"); }

    public synchronized String getSomething() { return something; }

	private String something;
}

/*
 * public enum MySingleton {
	INSTANCE;
   }
 * 
 * compiles into:-
 * 
 * public final class MySingleton {
     public final static MySingleton INSTANCE = new MySingleton();
     private MySingleton(){} 
   }
 *
 */

