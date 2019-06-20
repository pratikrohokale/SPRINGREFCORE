package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Department;

public class PAndCNameSpaceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Department dept=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Target Bean (Department)
		dept=factory.getBean("dept",Department.class);
		System.out.println(dept);
	}//main
}//class
