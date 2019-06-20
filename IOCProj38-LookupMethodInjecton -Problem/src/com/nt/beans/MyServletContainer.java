package com.nt.beans;

public class MyServletContainer {
	private RequestHandler handler;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}
	
	 public void setHandler(RequestHandler handler) {
			this.handler = handler;
		}
	 
	 public void handleRequest(String data){
		 System.out.println("MyServletCotainer is ready to handle the request");
		 handler.processRequest(data);
	 }

}
