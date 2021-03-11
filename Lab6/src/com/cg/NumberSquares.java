package com.cg;

import java.util.HashMap;
import java.util.Map;

public class NumberSquares {
	public static Map<Integer, Integer> getSquares(int[] arr){
		Map<Integer, Integer> m=new HashMap<Integer,Integer>();
		for(Integer i:arr) {
			m.put(i,i*i);
		}
		return m;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(getSquares(arr));
		
	}

}
