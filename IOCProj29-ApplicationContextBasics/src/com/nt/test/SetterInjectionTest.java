package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("main(-) method");
		ApplicationContext ctx=null;
		WishGenerator bean=null;
		//create IOC container
		//ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean (Target bean)
		bean=ctx.getBean("wish",WishGenerator.class);
		System.out.println("Result:::"+bean.generateWishMessage("raja"));
	}//main
}//class
