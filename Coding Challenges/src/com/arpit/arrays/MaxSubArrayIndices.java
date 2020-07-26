package com.arpit.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MaxSubArrayIndices {

	public static void main(String[] args) {
		
		int arr[] = {2, 2, 1, 4, 4,1,8};
		
		int result = 0;
		
		
		
		
		
		for (int i = 0; i <arr.length; i++) {
			result = result ^ arr[i]; // result = 1, 
			
		}
		System.out.println(result);
	}
}


class A{
	public void m1() {}	
}

class B extends A{
	public void m1(int a) {}
}