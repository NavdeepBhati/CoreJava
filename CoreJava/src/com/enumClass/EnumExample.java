package com.enumClass;

import com.enumClass.Coffee2.CoffeSize;

public class EnumExample {


	CoffeSize coffeeSize;
	
	public enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20){
		
			public String getLidCode() { // override the method for FALL
				return "A";
				}
		};

		private int value;

		private Season(int value) {
			this.value = value;
		}
		
		private int  getName() {
			return 5*value;
		} 
	
		
		public String getLidCode() { // this method is overridden
			return "B"; // the default value we want to
			}
	}


	public static void main(String[] args) {

		EnumExample enumEx = new EnumExample();
		enumEx.coffeeSize=CoffeSize.HUGE;
		

		CoffeSize smallCoffee = CoffeSize.SMALL;
		System.out.println("smallCOffee   " + smallCoffee);

		
		int winterVal = Season.WINTER.value;
		System.out.println("winterVal   " + winterVal);
		
		int winterValName = Season.WINTER.getName();
		System.out.println("winterValName   " + winterValName);


		String Winterlidcode=Season.WINTER.getLidCode();
		String falllidcode=Season.FALL.getLidCode();
		
		System.out.println("Winterlidcode   "+Winterlidcode);
		System.out.println("falllidcode   "+falllidcode);
		
		
		System.out.println("Looping.........");
		for (Season s : Season.values())
			System.out.println(s + "   " + s.value);

	}

}
