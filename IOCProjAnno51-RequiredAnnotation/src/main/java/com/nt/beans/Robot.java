package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id=101;
	private String name;
	private Date doj;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
	
	

}//class
