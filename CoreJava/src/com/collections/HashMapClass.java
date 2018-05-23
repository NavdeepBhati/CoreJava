package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {
public static void main(String[] args) {

	String str1="abc";
	String str2="abc";
	String str3=new String("abc");
	String str4=new String("abc");
	
	
	System.out.println(str1==str2);
	System.out.println((str1==str3 )+"  hashcode "+str1.hashCode() +"   "+str2.hashCode());
	System.out.println((str3==str4) +"  hashcode "+str3.hashCode() +"   "+str4.hashCode());
	
	Map<String,String> hmap = new HashMap<String, String>();
	
	hmap.put(str2, "str2");
	hmap.put(str1, "str1");
	hmap.put(str3, "str3");
	hmap.put(str4, "str43");
	
	for (Entry<String , String> entry : hmap.entrySet()) {
		
		System.out.println("Key   "+entry.getKey()  + "  " +"Value   " +entry.getValue()+"   " + entry.getKey().hashCode());
		
	}
	Employee e1= new Employee("Navdeep", 1);
	Employee e2= new Employee("Kushal", 1);
	
	Map<Employee,String> EmpMap = new HashMap<Employee, String>();

	EmpMap.put(e1, "Hello");
	EmpMap.put(e2, null);
	EmpMap.put(e1, null);
	
	
	for (Entry<Employee , String> entry : EmpMap.entrySet()) {
		
		System.out.println("Key   "+entry.getKey()  + "  " +"Value   " +entry.getValue()+"   " + entry.getKey().hashCode());
		
	}
	
stringBuilderMap();
}

private static void stringBuilderMap() {

	StringBuilder sb1 = new StringBuilder("Hello");
	StringBuilder sb2 = new StringBuilder("Hello");
	
	
	
	Map<StringBuilder,String> hmap = new HashMap<StringBuilder, String>();
	
	
	hmap.put(sb1, "sb1");
	hmap.put(sb2, "sb2");
	
	System.out.println("/////////////////////////////////////////////////////////////////////");
	
	
	
		for (Entry<StringBuilder, String> entry : hmap.entrySet()) {

			System.out.println("Key   " + entry.getKey() + "  " + "Value   " + entry.getValue() + "   "+ entry.getKey().hashCode());

		}
	}
}
