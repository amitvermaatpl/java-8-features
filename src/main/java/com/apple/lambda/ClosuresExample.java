package com.apple.lambda;

public class ClosuresExample {
	public static void main(String[] args) {		
		int i=10;
		int a=20;		
		
		doProcess(i, new Processor() {
			@Override
			public void process(int i) {
				System.out.println(i+a);	// 'a' closure, we can't change the value of 'a' //			
			}			
		});		
		
		doProcess(i, n -> System.out.println(i + a));  // 'a' is freeze now //		
		doProcess(i, (n)-> System.out.println("Number:= "+n));
	}
	
	public static void doProcess(int i, Processor p) {
		p.process(i);
	}
}

interface Processor{
	void process(int i);
}