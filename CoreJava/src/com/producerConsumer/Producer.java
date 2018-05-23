package com.producerConsumer;

import java.util.List;
import java.util.Stack;

public class Producer {

	Stack<String> strStack;
	List lsit;

	
	public Producer(Stack<String> strStack, List list) {
		this.strStack = strStack;
		this.lsit=list;
	}

	 public void produceMessage(String str) {
		
		
		synchronized (lsit) {
	
			System.out.println("Inside Producer.....");
			strStack.add(str);
			System.out.println("Message added in producer");
			lsit.notify();
		}
		
	

		
	}
}
