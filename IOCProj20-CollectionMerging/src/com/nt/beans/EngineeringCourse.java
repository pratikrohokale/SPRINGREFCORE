package com.nt.beans;

import java.util.List;

public class EngineeringCourse {

	private List<String> subjects;

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EngineeringCourse [subjects=" + subjects + "]";
	}
	
	
}
