package com.ifElseExamples;

public class IfElseLadder {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		
		System.out.println("Value of a is :"+a);
		System.out.println("Value of b is :"+b);
		
		if (a<b) {
			System.out.println("Biggest No is :"+b);
		}
		else if (a>b) {
			System.out.println("Biggest No is "+a);
		}
		else {
			System.out.println("Both a and b are equal");
		}
	}
}
