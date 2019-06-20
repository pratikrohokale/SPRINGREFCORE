package com.nt.beans;

import java.beans.ConstructorProperties;

public class Student{
	   private int sno;
	   private String sname;
	   private float  avg;
	   
	   @ConstructorProperties(value={"sno1","sname","avg"})
	  public  Student(int sno1,String sname,float avg){
		  System.out.println("Student:3-param constructor");
	     this.sno=sno1;
	    this.sname=sname;
	    this.avg=avg;
	   }
	 
	  public void showDetails(){
		  System.out.println("sno="+sno+"sname="+sname+"avg="+avg);
	  }
}//class