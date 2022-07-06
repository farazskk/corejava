package com.switchExamples;

public class Test {

	public static void main(String[] args) {

		int i = 25;
		switch (i) {
		case 5:
			System.out.println("five");
			break;
		case 10:
			System.out.println("ten");
			break;
		case 15:
			System.out.println("fifteen");
			break;
		case 20:
			System.out.println("twenty");
			break;
		case 25:
			System.out.println("twentyFive");
			break;
		default:
			System.out.println("number must be 5, 10, 15, 20, 25");
			break;
		}
	}
}
