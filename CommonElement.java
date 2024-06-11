package com.banesh;

import java.util.ArrayList;

public class CommonElement {

	public static void main(String[] args) {

		int[] list1 = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
		int[] list2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93};
		
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for (int i = 0; i < list1.length; i++) 
		{
			for (int j = 0; j < list2.length; j++) {
				if(list1[i]==list2[j]) 
				{
					list3.add(list1[i]);
				}
			}
		}
		
		System.out.println(list3);
	}

}
