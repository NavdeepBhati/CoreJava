package com.collections;

import java.util.Iterator;
import java.util.Map.Entry;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		
		
		java.util.concurrent.ConcurrentHashMap<Integer, Integer> chm= new java.util.concurrent.ConcurrentHashMap<>();
		
		
		
		chm.put(1, 1);
		chm.put(2, 2);
		chm.put(3, 3);
		chm.put(4, 4);
		chm.put(5, 5);
		chm.put(6, 6);
	
	
		for (Entry<Integer, Integer> es : chm.entrySet()) {
			
			System.out.println(es.getKey());
			chm.put(8, 1);
		
		}
	
	}
}
