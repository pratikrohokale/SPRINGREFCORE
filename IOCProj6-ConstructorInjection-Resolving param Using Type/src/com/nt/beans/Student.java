package com.nt.beans;

public class Student{
	   private int sno;
	   private String sname;
	   private float  avg;
	   
	  public  Student(int sno,String sname,float avg){
		  System.out.println("Student:3-param constructor");
	     this.sno=sno;
	    this.sname=sname;
	    this.avg=avg;
	   }
	 
	  public void showDetails(){
		  System.out.println("sno="+sno+"sname="+sname+"avg="+avg);
	  }
}//class