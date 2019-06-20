package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("course")
@Lazy
public class Course {
	@Value("java")
	private String cname;
	
	public Course(){
		System.out.println("Course:0-param constructor");
	}


	@Override
	public String toString() {
		return "Course [cname=" + cname + "]";
	}
}//class
