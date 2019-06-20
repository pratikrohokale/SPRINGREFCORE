package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener {
   private long start=0,end=0;
	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		if(ae.toString().indexOf("RefreshedEvent")!=-1){
			System.out.println("IOCcontainer is started at::"+new Date());
			 start=System.currentTimeMillis();
		}
		else if(ae.toString().indexOf("ClosedEvent")!=-1){
			System.out.println("IOC container is stopped/closed at::"+new Date());
			end=System.currentTimeMillis();
			System.out.println("IOC container is in running mode for"+(end-start)+" ms.");
		}
	}
}
