package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("main(-) method");
		Resource res=null;
		BeanFactory factory=null;
		WishGenerator generator=null,generator1=null;
		Object bean=null;
	   //locate SpringBean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create IOC container(BeanFactory)
		factory=new  XmlBeanFactory(res);
		//get Bean (Target bean)
		bean=factory.getBean("com.nt.beans.WishGenerator#0");
			// type casting
		generator=(WishGenerator)bean;
		System.out.println("Result:::"+generator.generateWishMessage("raja"));
		
		generator1=factory.getBean("com.nt.beans.WishGenerator#1",WishGenerator.class);
		System.out.println("Result:::"+generator1.generateWishMessage("ravi"));
	}//main
}//class
