package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesInString {

	
	/*
	 * public static void main(String[] args) { String txt = "ArpitArA"; int count =
	 * 0;
	 * 
	 * for (int i = 0; i < txt.length(); i++) { for (int j = i + 1; j <
	 * txt.length(); j++) { if (txt.charAt(i) == txt.charAt(j)) {
	 * System.out.println("Duplicates are : " + txt.charAt(i)); break; } } }
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		String txt = "ArpitAA";
		Map<Character, Integer> map = new HashMap<>();
		char arrNew[] = txt.toCharArray();

		for (Character ch : arrNew) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}

		Set<Character> keys = map.keySet();
		for (Character ch : keys) {
			if (map.get(ch) > 1)
				System.out.println(ch + "  is " + map.get(ch) + " times");
		}

	}
 
}
