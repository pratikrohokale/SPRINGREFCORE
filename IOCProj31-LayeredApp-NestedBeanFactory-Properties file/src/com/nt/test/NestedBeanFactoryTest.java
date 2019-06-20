package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.EmployeeController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory parentFactory=null,childFactory=null;
		EmployeeController controller=null;
		List<EmployeeDTO> listDTO=null;
		PropertyPlaceholderConfigurer ppc=null;
		//create parent IOC Container
		parentFactory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/business-beans.xml"));
		//get PropertyPlaceholderConfigurer Bean object
			ppc=parentFactory.getBean("pphc",PropertyPlaceholderConfigurer.class);
			ppc.postProcessBeanFactory((ConfigurableListableBeanFactory) parentFactory);
		//create Child IOC container
		childFactory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/presentation-beans.xml"),parentFactory);
		
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
