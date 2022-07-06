package com.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> list = new ArrayList<>();
		//list.add(1);
		
		System.out.println("Size:: " + list.size() + "Capacity:: " + findCapacity(list));
	}

	public static int findCapacity(ArrayList<Integer> list) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return ((Object[]) field.get(list)).length;

	}
	
}
