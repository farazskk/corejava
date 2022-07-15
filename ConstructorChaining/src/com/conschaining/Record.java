package com.conschaining;

class Person {

	public Person()
	{
		System.out.println("Person class no-args constructor called ");
	}
	
	public Person (String name)
	{
		System.out.println("Person class parameterized constructor called by "+name);
	}
}

public class Record extends Person
{
	public Record()
	{
		this("Record class");
		System.out.println("Record class no-args constructor called");
	}

	public Record(String name) 
	{
		super();
		System.out.println("Record class parameterized cons called by "+name);
	}
	
	public static void main(String[] args) {
		
		Record r = new Record();
		
	}
}

