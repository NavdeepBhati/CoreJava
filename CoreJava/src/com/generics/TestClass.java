package com.generics;

import java.util.List;

public class TestClass {

	public void insert(@SuppressWarnings("rawtypes") List list) {
		
			list.add(new Integer(5));
			list.add("hello");
		
	}
	
}
