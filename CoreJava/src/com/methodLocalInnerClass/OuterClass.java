package com.methodLocalInnerClass;

public class OuterClass {

	int instVar=10;
	
	public void outerClassMethod() {
		System.out.println(" Outer Class Method ");
	
		final int localVar=5;
		class InnerClass{
			public void innerClassMethod () {
				System.out.println(" Inner class Method");
			System.out.println("Local Var  " +localVar);
			System.out.println("Local Var  " + instVar);
			}
		}
		
		InnerClass ic= new InnerClass();
		ic.innerClassMethod();
	
	}
	
}
