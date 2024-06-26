package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		
		List values = new ArrayList();
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		
		for(Object value: values) {
			System.out.println(value);
		}
		
		System.out.println("-----------------------------------------");
		
		values.add(true);
		values.add("hello");
		
		for(Object value: values) {
			System.out.println(value);
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println(values.size());
		

	}

}
