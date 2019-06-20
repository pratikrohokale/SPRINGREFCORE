package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

public class Cricketer implements ApplicationContextAware {
	private String beanId;
	ApplicationContext ctx;
	
	public Cricketer() {
		System.out.println("Cricketer:0-param constructor");
	} 
	public void setBeanId(String beanId) {
		System.out.println("Cricketer:setBeanId(-)");
		this.beanId = beanId;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer:setApplicationContext(-)");
		this.ctx=ctx;
	}


	public void fielding(){
		System.out.println("Cricketer is fielding...");
	}
	
	public void bowling(){
		System.out.println("Cricketer is bowling...");
	}
	
	public  void batting(){
		System.out.println("battting method");
		Bat bat=null;
		//get Dependent Bean(Dependency lookup)
		bat=ctx.getBean(beanId,Bat.class);
		System.out.println("Cricketer is batting ...");
		bat.hittingRuns();
	}

	

}
