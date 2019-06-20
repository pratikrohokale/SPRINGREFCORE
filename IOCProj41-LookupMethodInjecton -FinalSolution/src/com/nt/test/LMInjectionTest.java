package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null,container1=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Taget Bean
		container=ctx.getBean("container",MyServletContainer.class);
		System.out.println("class name::"+container.getClass()+"super class name::"+container.getClass().getSuperclass()+" methods"+Arrays.toString(container.getClass().getMethods()));
		container.handleRequest("hello");
		System.out.println("---------------------");
		container.handleRequest("hai");
		System.out.println("=====================");
		container1=ctx.getBean("container",MyServletContainer.class);
		container1.handleRequest("winter");
		System.out.println("---------------------");
		container1.handleRequest("summer");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
