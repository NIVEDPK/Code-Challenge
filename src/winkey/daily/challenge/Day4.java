package winkey.daily.challenge;

import java.util.Arrays;

public class Day4 {
	
	
	/***
	 * 
	 * 
	 * 
		Good morning! Here's your coding interview problem for today.
		
		This problem was asked by Stripe.
		
		Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
		
		For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
		
		You can modify the input array in-place.
	 * 
	 * 
	 * 
	 * ***/

	public static void main(String[] args) {
		
		//Integer[] inAr = {3, 4, -1, 1};
		Integer[] inAr = {1, 2, 0};
		Arrays.sort(inAr);
		
		int cur, next = 0;
		int len = inAr.length;
		for (int i = 0; i < len; i++) {
			cur = inAr[i];
			next = cur+1;
			try {
				if(next != inAr[i+1] && next != 0)
					{System.out.println("Next Possible value is : ");break;}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Dosn't have any missing variable, Next Possible value is : ");
			}
		}
		System.out.println(next);
		
	}

}
