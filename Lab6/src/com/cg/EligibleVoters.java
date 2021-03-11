package com.cg;

import java.util.*;

public class EligibleVoters {
	public static List<Integer> votersList(HashMap<Integer, Integer> h) {
		List<Integer> l=new ArrayList<Integer>();
        for (Map.Entry<Integer,Integer> entry : h.entrySet()) {
			
			if(entry.getValue() >=18)
				l.add(entry.getKey());
			
        }
		return l;
	   
	}        
	

	public static void main(String[] args) {
    HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); 
		  
        
        h.put(1001,10); 
        h.put(1002,25); 
        h.put(1003,8); 
        h.put(1004,50);
        h.put(1005,15);
        System.out.println(votersList(h));

		

	}

}
