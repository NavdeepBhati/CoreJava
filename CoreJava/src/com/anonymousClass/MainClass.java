package com.anonymousClass;

public class MainClass {

	static	Foo f ;

	
	public static void main(String[] args) {

		InterfaceAnonymous interAnony = new InterfaceAnonymous() {

			@Override
			public void interfaceMethod() {
				System.out.println(" interfaceMethod");

			}
		};

		interAnony.interfaceMethod();

		go();
	}

	static void go() {
		Bar b = new Bar();

		
	//	b.doStuff(f);
		b.doStuff(new Foo() {

			public void foof() {
				System.out.println("foofy");
			}
		});
	}

}
