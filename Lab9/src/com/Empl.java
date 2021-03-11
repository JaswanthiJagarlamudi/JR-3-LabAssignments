package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Emplo{
	int empid;
	String name;
	int salary;
	public Emplo(){
		
	}
	public Emplo(int empid, String name,int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Empl {
	public static int getsum(List<Emplo> Emplist) {
		Integer in=Emplist.stream().map(e->e.getSalary()).reduce(0,(a,b)->a+b);
		return in.intValue();
	}
	public static void main(String[] args) {
	List<Emplo> Emplist=new ArrayList<Emplo>();
	
	Emplist.add(new Emplo(20,"ram",40000));
	Emplist.add(new Emplo(25,"ajay",30000));
	Emplist.add(new Emplo(22,"amit",60000));
	
	List<String> Namelist=Emplist.stream().map(e->e.getName()).collect(Collectors.toList());
	System.out.println(Namelist);
	Optional res=Emplist.stream().map(e->e.getSalary()).reduce((a,b)->a+b);
	System.out.println(res);
	Optional<Integer> i=Emplist.stream().map(e->e.getSalary()).max((a,b)->a.compareTo(b));
	System.out.println(i);
	Optional<Integer> in=Emplist.stream().map(e->e.getSalary()).reduce((a,b)->a>b?a:b);
	System.out.println(in);
	System.out.println(getsum(Emplist));
	}
	
}
