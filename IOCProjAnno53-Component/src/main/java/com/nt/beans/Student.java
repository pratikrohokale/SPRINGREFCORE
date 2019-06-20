package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
@Scope("prototype")
public class Student {
	@Autowired(required=true)
	private Course course;
	
	public Student() {
		System.out.println("Student:0-param constructor");
	}
	
	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}//class
