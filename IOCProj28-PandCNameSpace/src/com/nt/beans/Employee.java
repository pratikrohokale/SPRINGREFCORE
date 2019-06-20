package com.nt.beans;

import java.util.Date;

public class Employee {
	
	private int eno;
	private String ename;
	private Date doj;
	
	public Employee(int eno, String ename, Date doj) {
	   System.out.println("Employee: 3-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", doj=" + doj + "]";
	}
	
	

}
