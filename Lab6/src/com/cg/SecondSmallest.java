package com.cg;
import java.util.*;

public class SecondSmallest {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i:arr){
			list.add(i); 
		}

		Collections.sort(list);
		return list.get(1);
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		 
		System.out.println(getSecondSmallest(arr));
	}

}

		
		