package com.apple.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap {
	public static void main(String[] args) {
		
		  // FILTER-1: Filter map by keys //
	      Map<Integer, String> hmap = new HashMap<Integer, String>(); 
	      hmap.put(11, "Apple"); 
	      hmap.put(22, "Orange"); 
	      hmap.put(33, "Kiwi");  
	      hmap.put(44, "Banana"); 

	      Map<Integer, String> result = hmap.entrySet() 
	          .stream() 
	          .filter(map -> map.getKey().intValue() <= 22) 
	          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
	  
	      System.out.println("Result by using key: " + result);
	      
	      // FILTER-2: Filter map by values //
	      Map<Integer, String> hm = new HashMap<Integer, String>();
	      hm.put(11, "Apple");
	      hm.put(22, "Orange");
	      hm.put(33, "Kiwi");
	      hm.put(44, "Banana");

	      Map<Integer, String> res = hm.entrySet()
	      .stream()
	      .filter(map -> "Orange".equals(map.getValue()))
	      .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	      System.out.println("Result by using value: " + res);
	      
	      // FILTER-3: Filter map by using both key and value //
	      Map<Integer, String> hmp = new HashMap<Integer, String>();
	      hmp.put(1, "ABC");
	      hmp.put(2, "XCB");
	      hmp.put(3, "ABB");
	      hmp.put(4, "ZIO");

	      Map<Integer, String> record = hmp.entrySet()
	         .stream()
	         .filter(p -> p.getKey().intValue() <= 2) //filter by key
	         .filter(map -> map.getValue().startsWith("A")) //filter by value
	         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	     System.out.println("Result by using keya and value: " + record);
	   }
}
