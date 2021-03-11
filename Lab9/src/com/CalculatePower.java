package com;

interface NumPower {
	Double power(Double a,Double b);

}
public class CalculatePower{
    public static void main(String[] args) {
	    NumPower p=(a,b)->Math.pow(a,b);
	    System.out.println(p.power(2.00,5.00));
    }    
}

	
	

