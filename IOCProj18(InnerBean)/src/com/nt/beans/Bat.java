package com.nt.beans;

public class Bat {
	private int id;
	private String make;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public  void hitRuns(){
		System.out.println("Bat Id"+id +" make:"+make+" hitting runs");
	}
}
