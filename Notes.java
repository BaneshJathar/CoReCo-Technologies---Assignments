package com.banesh;

public class Notes {

	public static void main(String[] args) {
		
		int[] notes = {10,50,100,200};
		int price = 149;
		
		int total = 0;
		
		for (int i : notes) {
			total = total + i;
		}
		
		if(price <= total)
			System.out.println("I can purchase");
		else
			System.out.println("I need more money");
		
		
	}

}
