package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		
//		String s1 = "bb";
//		String s2 = "cc";
//		
//		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",4);
		map.put("e",5);
		map.put("f",6);
		map.put("g",7);
		map.put("h",8);
		map.put("i",9);
		map.put("j",10);
		map.put("k",11);
		map.put("l",12);		
		map.put("n",13);
		
		System.out.println(map.get("n"));
		
	}
}
