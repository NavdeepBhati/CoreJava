package com.multithreading;

public class StaticMeyhodClass {

	 static int z=1;
	private static int y=1;
	public synchronized static void syncname() {
	
	
			System.out.println("sync z "+ z +"   "+Thread.currentThread().getName());
			z++;
		

	}

	
	public static void name() {

		
		System.out.println("not sync y "+y+"   "+Thread.currentThread().getName());
		y++;
	}
	
}
