package winkey.daily.challenge;

import java.util.HashMap;
import java.util.Map;

public class Day1 {
	
	
	/** Easy
	 * 
	 * 
		Good morning! Here's your coding interview problem for today.
		
		This problem was recently asked by Google.
		
		Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
		
		For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
		
		Bonus: Can you do this in one pass?
	 * 
	 * 
	 * **/

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int k = 17;
		Integer[] arr = {10, 15, 3, 8};
		boolean flag = false;
		for (Integer i : arr) {
			if (map.get(Math.abs(k-i))==i) {
				flag = true;
				break;
			}else {
				map.put(i, Math.abs(k-i));
			}
		}
		
		System.out.println(map);
		
		System.out.println("Result is " + flag);
	}

}
