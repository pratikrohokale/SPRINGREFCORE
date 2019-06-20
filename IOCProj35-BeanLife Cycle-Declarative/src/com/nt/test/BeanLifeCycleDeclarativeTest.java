package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleDeclarativeTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 CheckVotingElgibility voter=null;
		//create IOC Container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 voter=ctx.getBean("voter",CheckVotingElgibility.class);
		 //invoke the method
		 System.out.println("Result::"+voter.checkVotingElgibility());
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}

}
