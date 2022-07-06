package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("faraz");
		list.add("salman");
		list.add("shaikh");
		list.add("rohit");
		list.add("rahul");

		new Thread() {

			public void run() {

				for (String i : list) {
					System.out.println(i);
				}
			}
		}.start();

		new Thread() {

			public void run() {

				System.out.println("adding new element to list");
				list.add(1, "DON");
			}
		}.start();
	}
}