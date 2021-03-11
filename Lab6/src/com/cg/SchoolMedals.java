package com.cg;
import java.util.*;
import java.util.HashMap;

public class SchoolMedals {
	public static Map<Integer,String> getStudents(HashMap<Integer, Integer> h){
		Map<Integer,String> m=new HashMap<Integer,String>();
		for (Map.Entry<Integer,Integer> entry : h.entrySet()) {
			
			if(entry.getValue() >=90)
				m.put(entry.getKey(),"Gold");
			if(entry.getValue() >=80 & entry.getValue() <90)
				m.put(entry.getKey(),"Silver");
			if(entry.getValue() >=70 & entry.getValue() <80)
				m.put(entry.getKey(),"Bronze");
			if(entry.getValue()<70)
				m.put(entry.getKey(),"Not Eligible");
		}
			
		return m;
		
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); 
		  
        
        h.put(1001,75); 
        h.put(1002,85); 
        h.put(1003,98); 
        h.put(1004,80);
        h.put(1005,50);
        System.out.println(getStudents(h));

	}

}
