package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.IntrAmtCalculator;

public class CustomPETest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculator iac=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		iac=ctx.getBean("iac",IntrAmtCalculator.class);
		System.out.println("Intr Amount:::"+iac.calcIntrAmount());
		//close Container
		((AbstractApplicationContext) ctx).close();
	}
}
