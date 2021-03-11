package com.cg;
import java.lang.*;
import java.util.*;

public class CharCount {
	public static Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		for(Character c:arr) {
			if(m.containsKey(c)) {
				Integer I=m.get(c);
				
				m.put(c,I+1);
			}
			else m.put(c,1);
		}
		
		return m;
	}

	public static void main(String[] args) {
		char[] arr= {'a','b','c','a','b'};
		
    System.out.println(countChars(arr));
	}

}
