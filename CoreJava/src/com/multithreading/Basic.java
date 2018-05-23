package com.multithreading;

public class Basic implements Runnable{

	
	
int j=0;	
	@Override
	public  void run() {

		
		
		//synchronized (this) {
			
			for (int i = 0; i < 5; i++) {
				
				System.err.println( "sync   "+ Thread.currentThread().getName()+"   p"+Thread.currentThread().getPriority() + "  "+i );			
			//	StaticMeyhodClass.name();
			//	StaticMeyhodClass.syncname();

	//		}
		}
		
//		StaticMeyhodClass.name();

		
/*		for (int i = 0; i < 10; i++) {
			
			System.out.println( "not "+Thread.currentThread().getName()+"   p"+Thread.currentThread().getPriority() + "  " +i);			
			StaticMeyhodClass.name();
			StaticMeyhodClass.syncname();

		}*/
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Basic b= new Basic();
		Basic b2= new Basic();

		Thread t0= new Thread(b);
		Thread t1= new Thread(b);
		Thread t2= new Thread(b);
		
	/*	Thread two0= new Thread("name");
		Thread two1= new Thread(b2);
		Thread two2= new Thread(b2);
	
		two0.setName("two0");
		two0.start();
		two1.setName("two1");
		two1.start();
		two2.setName("two2");
		two2.start();
		*/
		
		
		t0.start();
		//t0.join();

		System.out.println("t0 start");
		//t1.setPriority(10);
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println(t1.getState());
		System.out.println("t1 start");
		//t2.setPriority(1);

		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t1.getState());
		System.out.println("t2 start");
		t0.join();
		t1.join();
		t2.join();
		

	}
	
	
}
