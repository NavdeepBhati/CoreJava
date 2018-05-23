package com.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Cat());
		animalList.add(new Cat());
		name(animalList);
	
		List<Animal> catlList = new ArrayList<>();
		catlList.add(new Cat());
		catlList.add(new Cat());
		catlList.add(new Cat());
		CatList(catlList);
	
	}
	
	public static void name(List<? super Cat> animalList) {
		
		
		animalList.add(new Cat());
		//animalList.add(new Animal());

	}
	
	
	private  static void CatList(List<?  super Animal> List) {

		List.add(new Cat());
		List.add(new Animal());
		
	//Animal a=	 List.get(0);
		
	}
}
