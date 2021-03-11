package com.cg.eis.service;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String findScheme(Double Sal,String Designation) {
		if(Sal>5000 && Sal<20000 && Designation.equals("System Associate"))
			return "Scheme C";
		else if(Sal>=20000 && Sal<40000 && Designation.equals("Programmer"))
			return "Scheme B";
		else if(Sal>=40000 && Designation.equals("Manager"))
			return "Scheme A";
		else if(Sal<5000 && Designation.equals("Clerk"))
			return "No Scheme available";
		return Designation;
		
		
	}

}
