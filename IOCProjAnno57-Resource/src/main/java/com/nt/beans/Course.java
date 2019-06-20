package com.nt.beans;

import javax.inject.Named;

import org.springframework.context.annotation.DependsOn;

@Named("course1")
@DependsOn("st")
public class Course {
	private String cname;
	
	public Course() {
		System.out.println("Course:0-param constructor");
	}
	

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + "]";
	}
	

}
