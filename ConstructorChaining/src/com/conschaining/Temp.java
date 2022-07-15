package com.conschaining;

public class Temp {

	Temp() {
		this(5);
		System.out.println("This is default constructor");
	}

	Temp(int x) {
		this(5, 15);
		System.out.println(x);
	}

	Temp(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		Temp t1 = new Temp();
	}
}
