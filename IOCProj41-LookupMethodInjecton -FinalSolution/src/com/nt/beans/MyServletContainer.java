package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public abstract class MyServletContainer {

	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}

	public abstract RequestHandler getHandler();

	 public void handleRequest(String data){
		 System.out.println("MyServletCotainer is ready to handle the request");
		 RequestHandler handler=null;
		 //get Depedent bean class obj(Depedency lookup)
		 handler=getHandler();
		 //use RequestHandler
		 handler.processRequest(data);
	 }
}
