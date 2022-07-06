package com.arraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CoyyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();
		
		names.add("faraz");
		names.add("shaikh");
		names.add("raj");
		names.add("rahul");
		
		new Thread() {
			@Override
			public void run() {
				Iterator<String> collectionOfNames = names.iterator();
				while(collectionOfNames.hasNext()) {
					String tempName = collectionOfNames.next();
					System.out.println(tempName);
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("Adding don to the list");
				names.add(1,"don");
			}
		}.start();
	}
}
