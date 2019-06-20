package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVotingElgibility implements InitializingBean,DisposableBean{
	private String name;
	private int age;
	private String address;
	public CheckVotingElgibility() {
		System.out.println("0-param constructor");
	}
	public void setName(String name) {
		System.out.println("setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}
	
	public void setAddress(String address) {
		System.out.println("setAddress(-)");
		this.address = address;
	}
	
	public void myInit()throws Exception{
		System.out.println("myInit()");
		//check name,age properties are injected with correct values or not
		if(name==null || age<=0 )
			throw new Exception(" set proper values to name,age bean properties");
	}
	
	public String  checkVotingElgibility(){
		if(age<18)
			return " Mr/Miss"+name+" u r not elgible to vote";
		else
			return " Mr/Miss"+name+" u r  elgible to vote";
	}//method
@Override
public void destroy() throws Exception {
	System.out.println("destroy() method");
	name=null;
	age=0;
	address=null;
}
@Override
public void afterPropertiesSet() throws Exception {
  System.out.println("afterPropertiesSet()");
  
//check name,age properties are injected with correct values or not
		if(name==null || age<=0 )
			throw new Exception(" set proper values to name,age bean properties");
  
}
	
	public void myDestroy(){
		System.out.println("myDestroy() method");
		name=null;
		age=0;
		address=null;
	}
	
}//class
