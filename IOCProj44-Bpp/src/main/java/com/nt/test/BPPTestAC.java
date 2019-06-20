package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentEmployeeService;

public class BPPTestAC {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 StudentEmployeeService service=null;
		 //create IOC Container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 service=ctx.getBean("seService",StudentEmployeeService.class);
		 //invoke method
		 service.registerEmployee(1001,"raja","HCL");
		 service.registerEmployee(1002,"ravi","HCL");
		 System.out.println("----------------------------------");
		 service.registerStudent(1003,"jani","spring");
		 service.registerStudent(1004,"rathod","spring");
		 
		 //close IOC container
		 ((AbstractApplicationContext) ctx).close();

	}//main
}//class
