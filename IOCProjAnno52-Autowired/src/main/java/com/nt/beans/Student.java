package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	//@Autowired(required=true)
	private Course course;
	
	@Autowired
	public Student(Course course){
		System.out.println("Student::1-param constuructor");
		this.course=course;
	}
	
	


//	@Autowired(required=true)
	//@Qualifier(value="course1")
	/*@Qualifier(value="c1")
	public void setCourse(Course course) {
		System.out.println("setCourse(-)");
		this.course = course;
	}*/
	
	/*@Autowired
	public void assign(Course course){
		System.out.println("assign(-)");
		this.course=course;
	}*/

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}//class
