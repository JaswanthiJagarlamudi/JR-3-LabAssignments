package com.cg.eis.exception;

import java.util.Scanner;

class EmployeeException extends Exception {
	 
	 String str1;
	 EmployeeException(String str2){
		 str1=str2;
	 }
	 public String toString() {
		 return(str1);
	 }
	} 

public class SalaryValidation {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter your salary");
		  int salary = s.nextInt();
		  
		  try {
		   if(salary < 3000) 
		    throw new EmployeeException("Low Salary");
		   else
		    System.out.println(salary);
		  }
		  catch (EmployeeException a) {
		   System.out.println(a);
		  }
		 }

}
