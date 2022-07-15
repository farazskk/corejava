package com.breakk.statement;

class Test2 {
	public static void main(String[] args) {
		
		System.out.println("Before loop");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Inside loop, before break");
				break;
				//System.out.println("Inside loop, after break");	//Unresolved compilation problem: Unreachable code
			}
		}
		System.out.println("After Loop");
	}
}