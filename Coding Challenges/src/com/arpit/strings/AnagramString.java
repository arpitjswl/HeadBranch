package com.arpit.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AnagramString {

	public static void main(String[] args) {
		String arr[] = {"cat", "dog", "tac", "god", "act"};
		
		
		//System.out.println(getListofAnagrams(arr).keySet());
		System.out.println(getListofAnagrams(arr).values());
		
	}
	
	public static Map<String, List<String>> getListofAnagrams(String arr[]){
			
		
		Map<String, List<String>> map = new ConcurrentHashMap<>();
		
		for (String s : arr) {
			char chArr[] = s.toCharArray();
			Arrays.sort(chArr);
			String sortedString = new String(chArr);
			
			if (map.containsKey(sortedString)) 
				map.get(sortedString).add(s);
			else {
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(sortedString, list);
			}
		}
		
		Set<String> set4 = map.keySet();
		for (String s5 : set4) {
			System.out.println("Key is " + s5);
		}
		
		return map;
	}
 }







