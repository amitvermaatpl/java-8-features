package com.apple.lambda;

public class HelloLambda {

	public static void main(String[] args) {
		Greeting urduGreeter= new GreetingImpl();
		
		Greeting hindiGreeter= () -> { System.out.println("Namaste");};
		Greeting englishGreeter= () -> { System.out.println("Good Morning");};
		
		performGreet(hindiGreeter);
		performGreet(englishGreeter);
		
		urduGreeter.greet();
	}
	
	static void performGreet(Greeting l){
		l.greet();
	}

}

interface Greeting{
	void greet();
}

class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		System.out.println("Aadab...");
	}
	
}
