package com.nt.bo;

public class StudentBO extends PersonBO {
	private String course;

public StudentBO(){
	System.out.println("StudentBO:0-param constructor");
}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentBO:"+super.toString()+" [course=" + course + "]";
	}
   
}
