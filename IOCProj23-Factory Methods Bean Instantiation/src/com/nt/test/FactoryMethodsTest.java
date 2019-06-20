package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class FactoryMethodsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Class clazz=null;
		Calendar cal=null;
		String  s2=null,s3=null;
		//create IOC contianer
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Beans
		clazz=factory.getBean("c",Class.class);
		System.out.println("clazz  class ame::"+clazz.getClass()+" ---> Data is::"+clazz);
		System.out.println("-----------------------------------------------------------");
		cal=factory.getBean("cl",Calendar.class);
		System.out.println("cal  class ame::"+cal.getClass()+" ---> Data is::"+cal);
		System.out.println("-----------------------------------------------------------");
		s2=factory.getBean("s2",String.class);
		System.out.println("s2  class ame::"+s2.getClass()+" ---> Data is::"+s2);
		System.out.println("-----------------------------------------------------------");
		s3=factory.getBean("s3",String.class);
		System.out.println("s3  class ame::"+s3.getClass()+" ---> Data is::"+s3);
	}//main
}//class
