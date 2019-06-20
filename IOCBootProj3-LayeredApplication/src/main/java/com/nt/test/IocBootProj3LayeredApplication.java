package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.controller.StudentController;

@SpringBootApplication
@Import(value=AppConfig.class)
public class IocBootProj3LayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentController controller=null;
		String result=null;
		ctx=SpringApplication.run(IocBootProj3LayeredApplication.class, args);
		//get Bean
		controller=ctx.getBean("stController",StudentController.class);
		try{
		//invoke methods
		result=controller.processStudent("1001","raja","89","89","89");
		System.out.println(result);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}//main
}//class
