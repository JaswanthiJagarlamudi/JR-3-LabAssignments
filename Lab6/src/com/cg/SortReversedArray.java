package com.cg;

import java.util.ArrayList;
import java.util.Collections;

public class SortReversedArray {
	
	public static void getSorted(int a[]) {
		int n=a.length;
		ArrayList<String> arrlist = new ArrayList<String>();
		
		for(int num:a) {
			
			 String s=String.valueOf(num);
			
			 char ch[]=s.toCharArray();  
			 String rev="";  
			 for(int i=ch.length-1;i>=0;i--){  
			    rev+=ch[i]; 
			 }
			 arrlist.add(rev);
			
		}
		Collections.sort(arrlist);
		System.out.println(arrlist);
}
	
	public static void main(String[] args) {
		int[] a= {25,89,78,54,27};
		getSorted(a);
		}

	}


