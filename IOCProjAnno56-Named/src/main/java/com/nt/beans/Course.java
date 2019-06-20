package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("course")
public class Course {
	@Value("java")
	private String cname;

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + "]";
	}
	

}
