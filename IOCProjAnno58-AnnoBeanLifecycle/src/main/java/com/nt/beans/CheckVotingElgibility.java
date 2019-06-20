package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("voter")
public class CheckVotingElgibility {
	@Value("raja")
	private String name;
	//@Value("30")
	private int age;
	
	@PostConstruct
	public  void myInit(){
		System.out.println("Anno::custom init::myInit() method");
		if(age<=0)
			throw new IllegalArgumentException("age must be >0");
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("Anno::custom destroy::myDestroy() method");
		name=null;
		age=0;
	}
	
	public String checkVotingElgibility(){
		if(age<18)
			 return "Mr/Miss/Mrs:"+name+" your not elgible to vote ";
		else
			 return "Mr/Miss/Mrs:"+name+" your  elgible to vote ";
	}

}//class
