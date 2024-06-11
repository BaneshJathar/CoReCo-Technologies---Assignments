package com.banesh;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World";
	
		String rev = "";
		
		char[] ch = str.toCharArray();
		
		for (int i = str.length()-1; i >= 0; i--) 
		{
			rev = rev + ch[i];
		}
		
		System.out.println(rev);
	}

}
