package com.nt.bo;

public class EmployeeBO extends PersonBO {
	private String company;

	public EmployeeBO() {
		System.out.println("EmployeeBO:0-param constructor");
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeBO:"+super.toString()+" [company=" + company + "]";
	}

	   
}
