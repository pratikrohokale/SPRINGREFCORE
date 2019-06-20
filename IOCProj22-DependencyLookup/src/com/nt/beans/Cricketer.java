package com.nt.beans;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class Cricketer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void fielding(){
		System.out.println("Cricketer is fielding...");
	}
	
	public void bowling(){
		System.out.println("Cricketer is bowling...");
	}
	
	public  void batting(){
		System.out.println("battting method");
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Bat bat=null;
		//create IOC container
		factory=new  DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Dependent Bean(Dependency lookup)
		bat=factory.getBean(beanId,Bat.class);
		bat.hittingRuns();
	}


}
