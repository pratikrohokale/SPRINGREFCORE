package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

public class Student {
	//@Inject
	//@Named("course1")
	private Course course;
	
/*	@Inject
	@Named("course1")
	public Student(Course course){
		System.out.println("Student::1-param constuructor");
		this.course=course;
	}
	*/
	



/*	@Inject
	//@Named("course1")
	//@Named("c1")
	@Qualifier("c1")
	public void setCourse(Course course) {
		System.out.println("setCourse(-)");
		this.course = course;
	}
	*/
	
	@Inject
	@Named("course1")
	public void assign(Course course){
		System.out.println("assign(-)");
		this.course=course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}//class
