package com.breakk.statement;

public class Test3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)// Outer loop
		{
			for (int j = 0; j < 10; j++)// Nested Loop
			{
				if (j == 5) {
					break;
				}
				System.out.println(i + " " + j);
			}
			// Outside of nested Loop
		}
	}
}
