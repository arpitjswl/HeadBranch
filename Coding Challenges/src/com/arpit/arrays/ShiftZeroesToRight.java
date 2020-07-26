package com.arpit.arrays;


public class ShiftZeroesToRight {

	public static void main(String[] args) {
		int arr[] = {1, 3, 0};
		int cnt = arr.length - 1; // 3 
		
		for (int i = cnt ; i >= 0 ; i--) {
			if (arr[i] != 0) {
				arr[cnt] = arr[i]; // arr[1] = 1  
				cnt--;
			}
		}
		
		while (cnt >= 0)
		{
			arr[cnt] = 0;
			cnt--;
		}
		
		for (int i = 0; i < arr.length; ++i) {
	        System.out.print("--> "+arr[i]);
	    }
	

	}

}
