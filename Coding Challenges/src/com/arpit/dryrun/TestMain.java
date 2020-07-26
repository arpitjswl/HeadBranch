package com.arpit.dryrun;

import java.util.HashMap;

class Stack{
	Integer MAX_SIZE = 100;
	Integer[] arr = new Integer[MAX_SIZE];
	Integer top;
	
	public Stack() {this.top = -1;}
	
	public void push(Integer val) {
		arr[++top] = val;
	}
	
	public int pop() {
		int x = arr[top--];
		return x;
	}
	
	
}


public final class TestMain implements Cloneable{
	public static void  main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println( stack.pop() );
		
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		Integer[] array = {1, 2, 4, 4, 8};
		
		// 4 * 4 = 16
		int target = 16;
		for (int i = 0; i < array.length; i++) {
			
			if (hm.containsKey(array[i])) {
				//if (target == arr[i] +)
				System.out.println("indexes are " + hm.get(array[i] + "" +i));
			}
			else {
				hm.put(array[i], i);
			}
		}
		
		
	}
	
}

	












