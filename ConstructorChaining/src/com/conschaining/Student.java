package com.conschaining;

public class Student {

	int id;
	String name;
	String city;

	public Student(int id, String name) {
	
		this.id=id;
		this.name=name;
	}
	
	public Student(int id,String name,String city) {
		
		this(id,name);
		this.city=city;
	}
	
	void display() {
		System.out.println("Id :"+id+", Name : "+name+", City : "+city);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(1, "Faraz");
		Student s2 = new Student(2, "Shaikh", "Mumbai");
		
		s.display();
		s2.display();
	}
}
