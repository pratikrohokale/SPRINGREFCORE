package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class AnnoBeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVotingElgibility voter=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		voter=ctx.getBean("voter",CheckVotingElgibility.class);
		System.out.println(voter.checkVotingElgibility());
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
