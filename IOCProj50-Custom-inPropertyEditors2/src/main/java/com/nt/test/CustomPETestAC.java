package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.pe.IntrAmtDetailsEditor;

public class CustomPETestAC {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		IntrAmtCalculator iac=null;
 		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//add Custom PropertyEditorRegistrar with IOC Container
		//get Bean
		iac=ctx.getBean("iac",IntrAmtCalculator.class);
		System.out.println("Intr Amount:::"+iac.calcIntrAmount());
	}//main
}//class
