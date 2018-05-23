package com.regularInnerClass;

public class OuterClass {

	
	private int var=5; 
	
	
	public void outerMethod() {
		System.out.println("Outer Method");
		InnerClass innerC= new InnerClass();
		innerC.calledFromParentClass();
	}
	
	protected class InnerClass{
		
		//---------Cannt have ststic method
		/*public static void staticInnerMethod() {
			System.out.println("Static Inner Method");
		}*/
		
		public void innerMethod() {
			System.out.println("Inner Method  " + " Private var=   "+var);
		}
		public void calledFromParentClass() {
			System.out.println("Inner method called from Parent class");
		}
		
	}
	
	
}
