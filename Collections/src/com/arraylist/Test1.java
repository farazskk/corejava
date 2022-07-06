package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Remove duplicate elements in arraylist using LinkedHashSet
// LinkedHashSet does not allow duplicate Elements
// LinkedHashSet class maintains insertion order.

public class Test1 {

	public static void main(String[] args) {
		// ArrayList with duplicate elements
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(10, 9, 5, 7, 1, 1, 2, 3, 3, 3, 4, 1, 5, 6, 6, 6, 7, 8));

		System.out.println(numbersList);

		//LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);

		// System.out.println(hashSet);

		//ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

		//System.out.println(listWithoutDuplicates);
		
	}
}
