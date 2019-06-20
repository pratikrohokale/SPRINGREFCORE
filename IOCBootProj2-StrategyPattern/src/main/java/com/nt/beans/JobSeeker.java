package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("js")
public class JobSeeker {
	@Autowired
	@Qualifier("java")
	private Course course;
	
	public String getSoftwareJob(){
		System.out.println(course.studyCourse());
		return "Attended Interview ---> Got Software Job";
	}

}
