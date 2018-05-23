package com.producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainClass {

	
	public static void main(String[] args) {
	

		Stack<String> strStack= new Stack<>();
		List list = new ArrayList<>();   /// you can take any shared obj to sync wait and notify 
		
		 final Producer prod = new Producer(strStack,list);
	
		final Consumer cons= new Consumer(strStack,list);
	
		new Thread() {
			public void run() {
				cons.consumeMessage();
			}
		}.start();
		
		new Thread() {
			public void run() {
				cons.consumeMessage();
			}
		}.start();
		
		
		
		new Thread() {
			public void run() {
				prod.produceMessage("one");
			}
		}.start();
		
		new Thread() {
			public void run() {
				prod.produceMessage("two");
			}
		}.start();
		
		

		new Thread() {
			public void run() {
				cons.consumeMessage();
			}
		}.start();
		
		new Thread() {
			public void run() {
				prod.produceMessage("three");
			}
		}.start();
		
		new Thread() {
			public void run() {
				prod.produceMessage("four");
			}
		}.start();
		
		new Thread() {
			public void run() {
				prod.produceMessage("five");
			}
		}.start();

		
		new Thread() {
			public void run() {
				cons.consumeMessage();
			}
		}.start();
		
		new Thread() {
			public void run() {
				cons.consumeMessage();
			}
		}.start();
		
		
		
		
		
		
	}
	
}
