package com.nt.bo;

import java.util.Date;

public abstract class PersonBO {
	private int no;
	private String name;
	private Date doj;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "[no=" + no + ", name=" + name + ", doj=" + doj + "]";
	}
	
	

}
