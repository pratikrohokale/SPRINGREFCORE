package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.bpp.MyBeanPostProcessor;


public class BeanLifeCycleTestAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null; 
		WishGenerator wish=null;
		 //create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get bean 
		// wish=ctx.getBean("wish",WishGenerator.class);
		 System.out.println("------------------------------");
		 
		 ((AbstractApplicationContext) ctx).close();
	}
}
