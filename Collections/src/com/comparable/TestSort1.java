package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

// ******************  Example of the Comparable interface that sorts the list elements on the basis of age.  ******************

class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class TestSort1 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Faraz", 25));
		al.add(new Student(106, "Shaikh", 22));
		al.add(new Student(104, "Raj", 18));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
