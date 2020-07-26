package com.arpit.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = {1, 7, 9, 12, 19,7};
		
		// Another way to do this
	//	System.out.println(containsDup(arr));
		Arrays.sort(arr);
		
		for (int i = 0; i <arr.length - 1; i++) {
			if (arr[i] == arr[i+1])
				System.out.println("Contains duplicate");
		}
	}
	
	static boolean containsDup(int arr[]) {
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i]))
				return true;
			else
				hs.add(arr[i]);
		}
		return false;
	}
}
