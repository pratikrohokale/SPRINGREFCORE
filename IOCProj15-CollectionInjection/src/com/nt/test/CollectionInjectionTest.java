package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.College;
import com.nt.beans.EmployeeDetails;
import com.nt.beans.Faculty;
import com.nt.beans.Person;
import com.nt.beans.University;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		 BeanDefinitionReader reader=null;
		 Person per=null;
		 College clg=null;
		 Faculty faculty=null;
		 University uni=null;
		 EmployeeDetails emp;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		per=factory.getBean("per",Person.class);
		System.out.println(per);
		//get Bean
		clg=factory.getBean("clg",College.class);
		System.out.println(clg);
		//get Bean
		faculty=factory.getBean("faculty",Faculty.class);
		System.out.println(faculty);
		//get Bean
		uni=factory.getBean("uni",University.class);
		System.out.println(uni);
		//get Bean
		emp=factory.getBean("empDetails",EmployeeDetails.class);
		System.out.println(emp);
	}//main
}//class
