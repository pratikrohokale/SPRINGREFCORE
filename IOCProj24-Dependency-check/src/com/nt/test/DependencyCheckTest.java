package com.nt.test;


import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.strategy.Viechle;

public class DependencyCheckTest {

	public static void main(String[] args) {
		 Viechle viechle=null;
		 DefaultListableBeanFactory factory=null;
		 BeanDefinitionReader reader=null;
		 //create IOC Container
		// factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		  
		 factory=new DefaultListableBeanFactory();
		  reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		  
           //get Bean
		 viechle=factory.getBean("viechle",Viechle.class);
		  viechle.move();
		  System.out.println("------------------------------");
		 viechle.park();
	}

}
