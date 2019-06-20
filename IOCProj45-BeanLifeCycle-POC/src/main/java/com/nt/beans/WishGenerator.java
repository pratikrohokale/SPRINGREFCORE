package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WishGenerator implements BeanFactoryAware,ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean {
	private  String name;
	private int age;
	
	public WishGenerator() {
		System.out.println("WishGenerator:0-param constructor");
	}
	
	public void setAge(int age) {
		System.out.println("WishGenerator:setAge(-)");
		this.age = age;
	}

	public WishGenerator(String name) {
		System.out.println("WishGenerator:1-param constructor");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterProperitesSet");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName(-)");
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory(-)");
	}
	
	public void  myInit(){
		System.out.println("custom init method");
	}
	
	public void myDestroy(){
		System.out.println("custom destroy method");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext(-)");
	}

}
