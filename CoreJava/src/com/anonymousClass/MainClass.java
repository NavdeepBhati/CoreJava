package com.anonymousClass;

public class MainClass {

	static Foo f;

	public static void main(String[] args) {

		InterfaceAnonymous interAnony = new InterfaceAnonymous() {

			@Override
			public void interfaceMethod() {
				System.out.println(" interfaceMethod");

			}
		};

		interAnony.interfaceMethod();

		go();

		classBarImpl();
	}

	private static void classBarImpl() {

		Bar b = new Bar() {

			public void doStuff(Foo foo) {

				System.out.println("ClassBarImpl Called");

			}
		};

		Foo f = null;
		b.doStuff(f);

	}

	
	
	
	static void go() {
		Bar b = new Bar();

		// b.doStuff(f);
		b.doStuff(new Foo() {

			public void foof() {
				System.out.println("foofy");
			}
		});
	}

}
