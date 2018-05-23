package com.producerConsumer;

import java.util.List;
import java.util.Stack;

public class Consumer {

	Stack<String> strStack;
	List list;
	
	public Consumer(Stack<String> strStack, List list) {
		this.strStack = strStack;
		this.list=list;

	}

	 public void consumeMessage() {

		synchronized (list) {
		
			while (strStack.isEmpty()) {
				System.out.println("strStack is empty     " +Thread.currentThread().getName() );
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		//	System.out.println("Outside while    "+Thread.currentThread().getName());
			System.err.println(strStack.pop() +  "     " +Thread.currentThread().getName());
			
		}
		
	}

}
