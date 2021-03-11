package com.cg;
import java.lang.*;
import java.util.*;



public class SortMap {
	public static List getValues(HashMap<String, Integer> h) { 
		List li=new ArrayList();
		Collection list=h.values();
		li.addAll(list);
        Collections.sort(li);
        return li;
    } 

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>(); 
		  
         
        h.put("Dolphin", 10); 
        h.put("Banana", 30); 
        h.put("Emphasis", 25); 
        h.put("Apple", 5); 
        h.put("Java", 29); 
        h.put("Calorie", 2); 
        System.out.println(getValues (h));
       
    }

}

        
        
	


	  

	
	


	