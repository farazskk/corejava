package com.bas;

public class OrderOfExecution {

	public OrderOfExecution() {

		System.out.println("Default constructor called");
	}
	
	static {

		System.out.println("Static block called");
	}

	{
		System.out.println("Instance block called");
	}

	public void demo() {

		System.out.println("Instance method called");
	}
	
	public static void demo2() {
		
		System.out.println("Static method called");
	}

	public static void main(String[] args) {

		OrderOfExecution obj1 = new OrderOfExecution();
		
		OrderOfExecution.demo2();
		obj1.demo();
		
	}
}
