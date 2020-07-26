package com.arpit.arrays;

public class MaxStockProfit {

	public static void main(String[] args) {
		
		int arr[] = {7, 2, 1, 67, 98, 12};
		System.out.println("Max profit is :::: " +max_profit(arr));
	}
	
	static Integer max_profit(int arr[]) {
		int min_stock_price = Integer.MAX_VALUE;
		int max_profit = 0;
		
		for (int k = 0; k <arr.length; k++) {
			if (arr[k] < min_stock_price)
				min_stock_price = arr[k];
			else if(arr[k] - min_stock_price > max_profit)
				max_profit = arr[k] - min_stock_price;	
		}
		return max_profit;
	}
}
