package com.nt.beans;

import javax.inject.Named;

@Named("st")
public class Student {
	//@Resource(name="course1")
	private Course course;
	
	public Student() {
		System.out.println("Student:0-param constructor");
	}
	
/*	@Resource(name="course1")-->Does not supports constructor mode autowiring
	public Student(Course course){
		System.out.println("Student::1-param constuructor");
		this.course=course;
	}*/
	
	


/*	@Resource(name="course1")
	public void setCourse(Course course) {
		System.out.println("setCourse(-)");
		this.course = course;
	}*/
	
	/*@Resource(name="course1")
	public void assign(Course course){
		System.out.println("assign(-)");
		this.course=course;
	}*/

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}//class
