package com.singleton;

public class Singleton {

	private static Singleton s;

	 Singleton() throws Exception {
		 throw new Exception("as");

	 }

	public static Singleton getInstance() throws Exception {
		s = new Singleton();
		return s;
	}
}
