package com.arpit.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ReturnIndices {

	public static void main(String[] args) {
		
		int []numbers = new int[]{2, 3, 7, 4, 8};
		int target = 7;
		int []result = getTwoSum(numbers, target);
		System.out.println(result[0] + "," + result[1]);		
	}
	
	public static int[] getTwoSum(int []numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i =0; i <numbers.length; i++) {
			int delta = target - numbers[i]; // delta = 3
			if (map.containsKey(delta))
				return new int[] {i, map.get(delta)};
			map.put(numbers[i],i);
			
			/* Inputs and o/ps
			 * 2, 0
			 * 3, 1
			 * 7, 2
			 * 4, 3
			 * 8, 4
			 */
		}
		return new int[] {-1,-1};
	}
}
