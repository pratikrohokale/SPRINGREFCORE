package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.bpp.DOJPostProccessor;
import com.nt.service.StudentEmployeeService;

public class BPPTestBF {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		 XmlBeanDefinitionReader reader=null;
		 StudentEmployeeService service=null;
		 //create IOC Container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //register BeanPostProcessorExplicitly
		 factory.addBeanPostProcessor(new DOJPostProccessor());
		 //get Bean
		 service=factory.getBean("seService",StudentEmployeeService.class);
		 //invoke method
		 service.registerEmployee(1001,"raja","HCL");
		 service.registerEmployee(1002,"ravi","HCL");
		 System.out.println("----------------------------------");
		 service.registerStudent(1003,"jani","spring");
		 service.registerStudent(1004,"rathod","spring");
		 
	}//main
}//class
