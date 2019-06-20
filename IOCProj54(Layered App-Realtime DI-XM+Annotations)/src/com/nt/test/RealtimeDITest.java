package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;

public class RealtimeDITest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 StudentController controller=null;
		 //create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
          //get Bean
		 controller=ctx.getBean("stController",StudentController.class);
		 //invoke method
		 try{
			 System.out.println("Result:::"+controller.processStudent("12232","Raja","90","89","89"));
		 }
		 catch(Exception e){
			 System.out.println("Internal Problem");
			 e.printStackTrace();
		 }
		 
	}

}
