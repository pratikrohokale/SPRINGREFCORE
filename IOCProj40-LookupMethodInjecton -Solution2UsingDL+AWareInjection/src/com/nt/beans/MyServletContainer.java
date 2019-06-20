package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}


	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}
	
	 
	 public void handleRequest(String data){
		 System.out.println("MyServletCotainer is ready to handle the request");
		 RequestHandler handler=null;
		 //get Depedent bean class obj(Depedency lookup)
		 handler=ctx.getBean(beanId,RequestHandler.class);
		 //use RequestHandler
		 handler.processRequest(data);
	 }


	

}
