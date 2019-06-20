package com.nt.beans;

import java.util.Date;

public class AadharDetails {
	private int no;
	private String name;
	private Date dob;
	
	public AadharDetails(int no, String name, Date dob) {
		System.out.println("AadharDetails:: 3-param constructor");
		this.no = no;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "AadharDetails [no=" + no + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	

}
