package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishGenerator;
import com.nt.bpp.MyBeanPostProcessor;


public class BeanLifeCycleTestBF {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		 XmlBeanDefinitionReader reader=null;
		 WishGenerator wish=null;
		 //create IOC Container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //register BPP
		 factory.addBeanPostProcessor(new MyBeanPostProcessor());
		 //get bean 
		 //wish=factory.getBean("wish",WishGenerator.class);
		 System.out.println("------------------------------");
		 
		 factory.destroySingletons();
	}
}
