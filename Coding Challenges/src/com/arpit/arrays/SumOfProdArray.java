package com.arpit.arrays;

public class SumOfProdArray {

	public static void main(String[] args) {
		int arr[] = {4, 7, 3};
		int left_op[] = new int[arr.length];
		int right_op[] = new int[arr.length];
		int out_arr[] = new int[arr.length];
		
		// {21, 12, 28}
		
		// Left o/p = {1, 4, 28}
		// Right o/p = {21, 3 , 1}
		
		left_op[0] = 1;
		right_op[arr.length - 1] = 1;
		
		for (int i = 1; i < arr.length; i++) {
			left_op[i] = arr[i - 1] * left_op [i - 1]; 
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			right_op[i] =  arr[i + 1] * right_op[i + 1]; 
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			out_arr[i] = left_op[i] * right_op[i]; 
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("--> "+out_arr[i]);
		}
	}

}
