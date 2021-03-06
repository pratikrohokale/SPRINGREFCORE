package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null,container1=null;
		//create IOC container
		//ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Taget Bean
		container=ctx.getBean("container",MyServletContainer.class);
		
		container.processRequest("hello");
		System.out.println("---------------------");
		container.processRequest("hai");
		System.out.println("=====================");
		container1=ctx.getBean("container",MyServletContainer.class);
		container1.processRequest("winter");
		System.out.println("---------------------");
		container1.processRequest("summer");
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
