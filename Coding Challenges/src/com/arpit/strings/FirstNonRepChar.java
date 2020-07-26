package com.arpit.strings;

public class FirstNonRepChar {

	public static void main(String[] args) {
		String txt = "aaabbrioprynnn";
		System.out.println(findFirstNonRepChar(txt));
		
	}
	
	static char findFirstNonRepChar(String txt) {
		for (int i = 0; i <txt.length(); i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < txt.length(); j++) {
				if (txt.charAt(i) == txt.charAt(j) && i != j) {
					isDuplicate = true;
					break;
				}
			}
			if ( !isDuplicate ) {
				return txt.charAt(i);
			}
		}
		return '_';

	}

}
