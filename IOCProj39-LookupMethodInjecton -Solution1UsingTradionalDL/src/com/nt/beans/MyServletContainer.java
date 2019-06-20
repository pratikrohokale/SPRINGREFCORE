package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}


	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}
	
	 
	 public void handleRequest(String data){
		 System.out.println("MyServletCotainer is ready to handle the request");
		 ApplicationContext ctx=null;
		 RequestHandler handler=null;
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 //get Depedent bean class obj(Depedency lookup)
		 handler=ctx.getBean(beanId,RequestHandler.class);
		 //use RequestHandler
		 handler.processRequest(data);
	 }

}
