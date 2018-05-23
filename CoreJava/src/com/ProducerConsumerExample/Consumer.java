package com.ProducerConsumerExample;

import java.util.Stack;

public class Consumer implements Runnable {

	Stack<String> strStack;
	
	public Consumer(Stack<String> strStack) {
		this.strStack = strStack;

	}

	@Override
	public void run() {
		consumeMessage();
	}

	 public void consumeMessage() {

		synchronized (strStack) {
		
			while (true) {

				if (strStack.isEmpty()) {
					System.out.println("strStack is empty     " +Thread.currentThread().getName() );

					try {
						strStack.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
				System.err.println(strStack.pop() +  "     " +Thread.currentThread().getName());

			}
			
		}
		
	}


}
