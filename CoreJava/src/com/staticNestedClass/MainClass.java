package com.staticNestedClass;

public class MainClass {

	
	public static void main(String[] args) {
		OuterClass outerClass= new OuterClass();	
	
	
		
	//OuterClass.InnerClass innerObj= outerClass.intVar;

	
	//OuterClass.InnerClass inn= oc.
		
	//OuterClass.InnerClass.statiInnerClassMethod();
	OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
	innerObj.innerClassMethod();
	
	
	
	OuterClass.InnerClass.statiInnerClassMethod();

	
	
	}
	
	
	
}
