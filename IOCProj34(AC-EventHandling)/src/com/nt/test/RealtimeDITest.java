package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class RealtimeDITest {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		 BeanDefinitionReader reader=null;
		 StudentController controller=null;
		 //create IOC container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
          //get Bean
		 controller=factory.getBean("stController",StudentController.class);
		 //invoke method
		 try{
			 System.out.println("Result:::"+controller.processStudent("109","Raja","90","89","89"));
		 }
		 catch(Exception e){
			 System.out.println("Internal Problem");
			 e.printStackTrace();
		 }
		 
		 
		 
	}

}
