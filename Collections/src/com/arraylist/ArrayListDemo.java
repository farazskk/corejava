package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Faraz");
		al.add("Shaikh");
		al.add("Raj");
		al.add("Rahul");

		new Thread() {
			@Override
			public void run() {

				Iterator<String> collectionOfNames = al.iterator();
				while (collectionOfNames.hasNext()) 
				{
					String tempName = collectionOfNames.next();
					System.out.println(tempName);
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {

				System.out.println("Adding Don to the list");
				al.add(1, "Don");
			}
		}.start();

	}
}
