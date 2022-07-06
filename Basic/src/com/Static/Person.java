package com.Static;

public class Person {

	static int age;
}

class Main
{
	public static void main(String[] args) {
			
	Person p1 = new Person();
	Person p2 = new Person();
	
	p1.age=20;
	p2.age=21;
	
	System.out.println("P1's age is "+p1.age);
	System.out.println("P2's age is "+p2.age);
	
}
}