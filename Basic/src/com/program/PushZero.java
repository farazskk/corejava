package com.program;

public class PushZero {

	public static void pushZerosToEnd(int arr[],int n) {

		int count = 0;
		
		for(int i=0; i<n; i++)
			if(arr[i] != 0)
				arr[count++] = arr[i];
		
		while(count<n)
			arr[count++] = 0;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,0,6,0,8,0,3,0,9};
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("After pushing all 0 element to the End : ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
