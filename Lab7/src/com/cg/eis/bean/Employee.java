package com.cg.eis.bean;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private String designation;
	private String insScheme;
	
    public Employee() {
		
	}	
	public Employee(int empid, String name, double salary, String designation, String insScheme) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insScheme=insScheme;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsScheme() {
		return insScheme;
	}
	public void setInsScheme(String insScheme) {
		this.insScheme = insScheme;
	}
	public String toString() {
		return empid+"\t"+name+"\t"+salary+"\t"+designation+"\t"+insScheme;
	}
	
}
