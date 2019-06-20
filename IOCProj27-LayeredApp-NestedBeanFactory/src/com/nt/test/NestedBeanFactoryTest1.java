package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.EmployeeController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory parentFactory=null,childFactory=null;
		BeanDefinitionReader reader1=null,reader2=null;
		EmployeeController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create parent IOC container
		parentFactory=new DefaultListableBeanFactory();
		reader1=new XmlBeanDefinitionReader(parentFactory);
		reader1.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/business-beans.xml"));
		//create child IOC container
		childFactory=new DefaultListableBeanFactory(parentFactory);
		reader2=new XmlBeanDefinitionReader(childFactory);
		reader2.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/presentation-beans.xml"));
		//get Controller class obj
		controller=childFactory.getBean("empController",EmployeeController.class);
		try{
		//invoke method
		listDTO=controller.processRequest("clerk");
		for(EmployeeDTO dto:listDTO){
			System.out.println(dto);
		}
		}
		catch(Exception e){
			System.out.println("Internal problem::--->"+e.getMessage());
		}
		
		
	}

}
