package com.ProducerConsumerExample;

import java.util.Stack;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {

		
		
		Stack<String> strStack = new Stack<>();

		Producer prod = new Producer(strStack);

		Consumer cons = new Consumer(strStack);

		Thread A = new Thread(prod, "Producer");
		Thread D = new Thread(prod, "Producer2");
		Thread B = new Thread(cons, "Consumer");
		Thread c = new Thread(cons, "Consumer2");

		B.setPriority(10);
		B.start();
		A.start();
		
		System.out.println("Threads started");
	
	Thread.sleep(500);
	

	
	System.out.println("A  "+A.isAlive()+"   A   "+A.getState());
	System.out.println("B  "+B.isAlive()+"   B   "+B.getState());
	}
	
}
