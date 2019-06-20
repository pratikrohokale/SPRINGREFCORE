package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Marks;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks mk=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		mk=factory.getBean("mk",Marks.class);
		mk.showDetails();
	}//main
}//class
