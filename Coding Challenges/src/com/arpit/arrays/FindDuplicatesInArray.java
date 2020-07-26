package com.arpit.arrays;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {0, 3, 1, 2, 3, 7, 7, 9, 9, 9};
		printDuplicates(arr);

	}
	
	static void printDuplicates(int arr[]) {
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		String occurence = "1";
		int occ = Integer.parseInt(occurence);
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+ 1);
			else
				map.put(arr[i], 1);
			
		}
		
		
		Set<Integer> set = map.keySet();
		
		for (Integer i : set) {
			if (map.get(i) > occ) {
				System.out.println(i + " is " + map.get(i) + " times");
			}
		}
	}

}
