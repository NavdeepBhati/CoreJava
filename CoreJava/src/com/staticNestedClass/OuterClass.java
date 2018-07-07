package com.staticNestedClass;

public class OuterClass {
	String s = "OuterString";

static int intVar=5;	
	
	
	static class InnerClass {

		int intVarInner= 10;
		
		public void innerClassMethod() {
			System.out.println("innerClassMethod"+ "    static Intvar=  "+ intVar);
		//	System.out.println("innerClassMethod"+ "    String s=  "+ s);  					Cannt access non static variable 
			System.out.println("innerClassMethod"+ "    intVarInner=  "+ intVarInner);
			
		}

		public static void statiInnerClassMethod() {
			System.out.println("statiInnerClassMethod" + "    stativ Intvar=  "+ intVar);
			//System.out.println("statiInnerClassMethod"+ "    String s=  "+ s);
		}
	}

}
