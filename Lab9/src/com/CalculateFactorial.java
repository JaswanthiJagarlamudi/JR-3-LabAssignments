package com;

import java.util.Scanner;

interface Calculate{
	int factorial(int num);
}

public class CalculateFactorial {
	
	public static int fac(int a){  
		  int i,fact=1;  
		     
		  for(i=1;i<=a;i++){    
		      fact=fact*i;    
		  }    
		  return fact;    
		 }  

	public static void main(String[] args) {
		Calculate c=CalculateFactorial::fac;
		System.out.println(c.factorial(5));
		
		
	}

}
