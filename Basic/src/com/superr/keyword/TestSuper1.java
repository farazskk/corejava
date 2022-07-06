package com.superr.keyword;

// **********************  super is used to refer immediate parent class instance variable.  **********************

class Animal{
	
	String color = "White";
}

class Dog extends Animal{
	
	String color = "Black";
	
	void printColor() {
		
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
	
		Dog d = new Dog();
		d.printColor();
	}	
}
