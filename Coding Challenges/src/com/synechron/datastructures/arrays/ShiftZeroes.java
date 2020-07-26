package com.synechron.datastructures.arrays;

import java.util.HashMap;

public class ShiftZeroes {

	public static void main(String[] args) {

		
		int arr[] = { 6, 0, -3, 0, 0, 4 };

		int index = 0;
		int nonZeroCount = 0;
		int arrLength = arr.length;
		
		int zero = 0;
		int nonZ = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				++zero;
			else
				++nonZ;
		}
		
		System.out.println("zero count" + zero);
		System.out.println("NON ZERO count" + nonZ);

		for (index = 0; index < arrLength; index++) {
			if (arr[index] != 0)
				arr[nonZeroCount++] = arr[index];

		}
		while (nonZeroCount < arrLength) {
			arr[nonZeroCount] = 0;
			++nonZeroCount;
		}

		for (index = 0; index < arrLength; index++)
			System.out.print(arr[index] + " -> ");
		System.out.print("NULL");
	
	}

}

