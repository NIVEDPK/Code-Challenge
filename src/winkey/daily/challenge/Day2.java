package winkey.daily.challenge;

import java.util.Arrays;

public class Day2 {

	/**
	 * 
	 * 
	 * 	Good morning! Here's your coding interview problem for today.

		This problem was asked by Uber.
		
		Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
		
		For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
		
		Follow-up: what if you can't use division?
		
	 * 
	 * **/
	
	
	public static void main(String[] args) {

		//Integer[] inAr = {1, 2, 3, 4, 5};
		Integer[] inAr = {3, 2, 1};
		Integer[] outAr = new Integer[inAr.length];
		
		for (int i = 0; i < outAr.length; i++) {
			int tempProd = 1;
			for (int j = 0; j < inAr.length; j++) {
				if (i!=j) {
					tempProd *= inAr[j];
				}
			}
			outAr[i] = tempProd;
		}
		
		System.out.println(Arrays.asList(inAr));
		
		System.out.println(Arrays.asList(outAr));
		
	}

}
