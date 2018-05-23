package com.staticNestedClass;

public class OuterClass {
	String s = "OuterString";

static int intVar=5;	
	
	
	static class InnerClass {

		public void innerClassMethod() {
			System.out.println("innerClassMethod"+ "    static Intvar=  "+ intVar);
			//System.out.println("innerClassMethod"+ "    String s=  "+ s);
			
		}

		public static void statiInnerClassMethod() {
			System.out.println("statiInnerClassMethod" + "    stativ Intvar=  "+ intVar);
			//System.out.println("statiInnerClassMethod"+ "    String s=  "+ s);
		}
	}

}
