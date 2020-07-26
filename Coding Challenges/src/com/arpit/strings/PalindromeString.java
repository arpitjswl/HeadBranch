package com.arpit.strings;

public class PalindromeString {

	public static void main(String[] args) {
		String txt = "12321";
		boolean flag = true;
		for (int i = 0; i < txt.length() / 2; i++) {
			if (txt.charAt(i) != txt.charAt(txt.length() - 1 - i)) {
				flag = false;
				break; // added commment1
			}
		}
		if (flag)
			System.out.println("A plaindrome");
		else
			System.out.println(" Not A palindrome");
		

	}

}
