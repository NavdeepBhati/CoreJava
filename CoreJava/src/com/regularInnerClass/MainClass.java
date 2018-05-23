package com.regularInnerClass;

public class MainClass {

	public static void main(String[] args) {
		
	OuterClass outClass= new OuterClass();
	outClass.outerMethod();
	
	OuterClass.InnerClass inClass= new OuterClass().new InnerClass();
	
	inClass.innerMethod();

	
	Object[] objArray = new Object[5];
	
	
	objArray[0]=5;
	objArray[1]="dsds";
	
	
	
	String str= (String) objArray[1];
	System.out.println(objArray[0]);
	System.out.println(objArray[1]);
	
	}
	
}
