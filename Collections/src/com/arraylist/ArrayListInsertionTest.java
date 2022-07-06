package com.arraylist;

import java.util.ArrayList;

public class ArrayListInsertionTest {

	public static void main(String[] args) {

		long begintTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long diff = System.currentTimeMillis();

		ArrayList<Integer> al = new ArrayList<>(1000);

		for(int i=1; i<=100000; i++) {
			al.add(i);
			//System.out.println(al.get(i-1));
		}
		System.out.println("Time taken to add 1000 elements in list:: "+(System.currentTimeMillis()-begintTime)+"ms");
		
		al.add(10, 3000);
		System.out.println("Time taken to add integer element 3000 at index 20:: "+(System.currentTimeMillis()-endTime)+"ms");
		
		al.add(1001, 5000);
		System.out.println("Time taken to add integer element 5000 at index 1001:: "+(System.currentTimeMillis()-diff)+"ms");
		
	}

	private static long diff(long l) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
