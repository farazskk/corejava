package com.ifElseExamples;

public class NestedIfElseEx {

	public static void main(String[] args) {

		int a = 50;
		int b = 90;
		int c = 30;

		System.out.println("value of a is :" + a);
		System.out.println("value of a is :" + b);
		System.out.println("value of a is :" + c);

		if (a > b) {
			if (a > c) {
				System.out.println("a is biggest");
			} else {
				System.out.println("c is biggest");
			}
		} else if (b > a) {
			if (b > c) {
				System.out.println("b is biggest");
			} else {
				System.out.println("c is biggest");
			}
		} else if (c > a) {
			if (c > b) {
				System.out.println("c is biggest");
			} else {
				System.out.println("b is biggest");
			}

		}else {
			System.out.println("a, b, c are Equal");
		}
	}
}
