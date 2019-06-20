package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		st=factory.getBean("st",Student.class);
		st.showDetails();
	}//main
}//class
