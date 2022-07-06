package com.superr.keyword;

//**********************  super is used to invoke parent class constructor.  **********************

class Animal3{
	
	public Animal3() {
		
		System.out.println("Animal is Created");
	}
}

class Dog3 extends Animal3{
	
	public Dog3() {
	
		super();
		System.out.println("Dog is created");
	}
}

public class TestSuper3 {

	public static void main(String[] args) {
		
		Dog3 d = new Dog3();
	}
}
