package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.TravelAgent;

public class AutoWireTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Resource res=null;
		TravelAgent agent=null;
		//locate Spring Bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		//get Bean
		agent=factory.getBean("agent",TravelAgent.class);
		agent.planTour();
	}//main
}//class
