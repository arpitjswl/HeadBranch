package com.arpit.strings;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String txt = "ArpitAAuuuuuuuuuuA";
		
		StringBuilder sb = new StringBuilder();
		int idx;
		for (int i = 0; i < txt.length(); i++) {
		    char c = txt.charAt(i);
		    idx = txt.indexOf(c, i + 1);
		    if (idx == -1) {
		        sb.append(c);
		    }
		}
		System.out.println(sb);

	}

}
