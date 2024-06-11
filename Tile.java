package com.banesh;

public class Tile {

	public static void main(String[] args) {

		
		System.out.println(possibleBonus(3,7)); // true
		System.out.println(possibleBonus(1,9)); // false
		System.out.println(possibleBonus(5,3)); // false
				
	}

	public static boolean possibleBonus(int yourTile, int friendTile) { 
		int a = yourTile;
		int b = friendTile;
		
		for(int i = 1; i <= 6; a++)
		{
			a=a+i;
			
			if(a==b)
			{
				return true;
			}
		}
		return false;
	}
}
