package com.banesh;

import java.util.Iterator;

public class ReverseWords {

	public static void main(String[] args) {

		String str = "Hello World";
		
		String[] word = str.split(" ");
		
		String result = "";
		
		for (int i = 0; i < word.length; i++) {
			String reverseString = reverseString(word[i]);
			result = result+reverseString+" ";
		}
		
		System.out.println(result);
	}

	static String reverseString(String word) {
		
		char[] ch = word.toCharArray();
		String rev = "";
		
		for (int i = ch.length-1; i >= 0; i--) {
			
			rev = rev+ch[i];
		}
		
		return rev;
	}

}
