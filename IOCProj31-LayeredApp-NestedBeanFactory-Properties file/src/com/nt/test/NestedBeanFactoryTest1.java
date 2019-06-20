package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		ApplicationContext childCtx=null,parentCtx=null;
		EmployeeController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create parent IOC container
		parentCtx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/business-beans.xml");
		//create child IOC container
		childCtx=new FileSystemXmlApplicationContext(new String[]{"src/com/nt/cfgs/presentation-beans.xml"},true,parentCtx);
		//get Controller class obj
		controller=childCtx.getBean("empController",EmployeeController.class);
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
