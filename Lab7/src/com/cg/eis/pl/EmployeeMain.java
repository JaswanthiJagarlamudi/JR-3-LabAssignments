package com.cg.eis.pl;

import com.cg.eis.service.EmployeeServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeServiceImpl eS = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		String ch = "Yes";
		System.out.println("Press 1 to find the Scheme");
		int c = sc.nextInt();
		while(ch.equalsIgnoreCase("yes")){
			switch(c) {
			case 1:
				
				Map<String , Integer> id = new HashMap();
				System.out.println("Enter the id of Employee");
				id.put("ID", sc.nextInt());
				
				Map<String , String> name = new HashMap();
				System.out.println("Enter the name of Employee");
				name.put("name", sc.next());
				
				Map<String , Double > salary = new HashMap();
				System.out.println("Enter the salary of Employee");
				salary.put("Salary", sc.nextDouble());
				
				Map<String , String> desig = new HashMap();
				System.out.println("Enter the designation of Employee");
				desig.put("ID", sc.next());
				
				Map.Entry<String,Double> entry = salary.entrySet().iterator().next();
				Map.Entry<String,String> entry1 = desig.entrySet().iterator().next();
				Double value1 = entry.getValue();
				String value2 = entry1.getValue();
				System.out.println(eS.findScheme(value1, value2));
				break;
			default : 
				System.out.println("Invalid data");
			}
			System.out.println("Do you want to continue.....???");
			ch = sc.next();
		}
	}

}