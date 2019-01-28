package com.apple.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambdaExample {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");
		
		// Consumer: void accept(T t); //
		Consumer printJob= p ->  { System.out.println(p);  };
		 
		pointList.forEach(printJob);

	}

}
