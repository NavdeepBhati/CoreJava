package com.producerConsumer;

class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		while (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit..." + Thread.currentThread().getName());
			try {
			//	Thread.sleep(10000);
				System.out.println("wait called before.....................");

				wait();
				System.out.println("wait called.....................");
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed..."+this.amount+"   "+ Thread.currentThread().getName());
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notifyAll();

	 }
}