package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.AadharDetails;
public class NullInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		 BeanDefinitionReader reader=null;
		 AadharDetails details=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		details=factory.getBean("uid",AadharDetails.class);
		System.out.println(details);
		}//main
}//class
