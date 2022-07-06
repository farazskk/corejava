package com.bas;

public class Test {

	public static void main(String[] args) {
		
		int System = 10;
		
		//System.out.println(System);  // Compilation Error
		
		java.lang.System.out.println(System);
		
		System = System + 10;
		
		java.lang.System.out.println(System);
	}
}
