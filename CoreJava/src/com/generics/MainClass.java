package com.generics;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		TestClass class1= new TestClass();
		class1.insert(list);

		System.out.println(list);
	}
}
