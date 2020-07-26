package com.arpit.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class ChefCode {

	public static void main(String[] args) {}
	
	static String foo(String ingredient,Vector<String> vec)
	{
	    for(String str:vec)
	    {
	        if(ingredient.indexOf(str)==0)
	        {
	            return str;
	        }
	    }
	    return "";
	}

}
