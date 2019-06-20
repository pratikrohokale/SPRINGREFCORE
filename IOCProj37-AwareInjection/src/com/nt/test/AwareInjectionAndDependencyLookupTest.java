package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;


public class AwareInjectionAndDependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Cricketer player=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        //get Bean
		player=ctx.getBean("player",Cricketer.class);
		player.batting();
		player.bowling();
		player.fielding();
	}//main
}//class
