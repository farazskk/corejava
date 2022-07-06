package com.bas;

import java.text.DecimalFormat;

public class Test2 {

	public static void main(String[] args) {
		
		float d = 12_32_43_234.3425f;
		
		System.out.println(d);
		
		float f = 2432534.45534f;
		
		System.out.println(f);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(5);
		
		System.out.println(df.format(f));
	}
}
