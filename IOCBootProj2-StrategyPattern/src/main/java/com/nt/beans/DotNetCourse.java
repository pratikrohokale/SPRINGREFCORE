package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("net")
public class DotNetCourse implements Course {
	
	@Override
	public String studyCourse() {
			return "Studying .Net Course";
	}

}
