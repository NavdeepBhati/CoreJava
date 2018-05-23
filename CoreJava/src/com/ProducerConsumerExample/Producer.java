package com.ProducerConsumerExample;

import java.util.Stack;

public class Producer implements Runnable {

	Stack<String> strStack;

	public Producer(Stack<String> strStack) {
		this.strStack = strStack;
	}

	@Override
	public void run() {
		try {
			produceMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void produceMessage() throws InterruptedException {

		String st = "";

		synchronized (strStack) {

			for (int i = 0; i < 20; i++) {
				strStack.notifyAll();
				System.out.println("Inside Producer.....");
				strStack.add(st + i);
				System.out.println("Message added in producer");
				Thread.sleep(100);
			}
		}

	}

}
