package com.arpit.datastructures.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] {1, 2, 3, 4, 5, 6, 7, 10};
		Integer target = 0;
		
		System.out.println("Enter element to be searched : ");
		target = new Scanner(System.in).nextInt();
		
		Integer result = getIndex(arr, 0, arr.length-1, target);
		System.out.println("Element found at index : " + result);
	}
	

	static Integer getIndex(Integer arr[], int left, int right, int target) {
		Integer index = 0;
		
		Integer mid = (left + right) / 2;
		
		if (arr[mid] == target)
			return mid;
		else if (target < arr[mid]) { // 3 > 1
			return getIndex(arr, left, mid - 1, target);
		}
		else {
			return getIndex(arr, mid + 1, right, target);
		}
	}
}
