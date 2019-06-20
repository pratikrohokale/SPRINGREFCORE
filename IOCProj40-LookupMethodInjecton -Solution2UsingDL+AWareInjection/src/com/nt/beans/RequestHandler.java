package com.nt.beans;

public class RequestHandler {
	private static int count=0;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-param constructor--->Count::"+count);
	}
	
	public void processRequest(String data){
		System.out.println("Processing Request with Data::"+data);
	}
}
