package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.EngineeringCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		EngineeringCourse course=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
        //get Bean
		course=factory.getBean("ec1stYear",EngineeringCourse.class);
		System.out.println(course);
	}//main
}//class
