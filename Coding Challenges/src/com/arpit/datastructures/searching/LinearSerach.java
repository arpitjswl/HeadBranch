package com.arpit.datastructures.searching;

import java.util.Scanner;

public class LinearSerach {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] {1, 4, -2, 6, 78};
		
		Integer result = getIndex(arr);
		
		if (result == -1)
			System.out.println("Element not found ");
		System.out.println("Element found at Index : " +result);

	}
	
	static Integer getIndex(Integer arr[]) {
		Integer index = 0;
		Integer target = 0;
		
		System.out.println("Enter element to be searched : ");
		target = new Scanner(System.in).nextInt();
		
		for (index = 0; index < arr.length; index++) {
			if (arr[index] == target)
				return index;
		}
		return -1;
	}

}
