package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
//@Primary
public class JavaCourse implements Course {
	
	@Override
	public String studyCourse() {
			return "Studying Java Course";
	}

}
