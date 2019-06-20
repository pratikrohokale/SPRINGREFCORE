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
		WishGenerator generator=null;
		Object bean=null;
	   //locate SpringBean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create IOC container(BeanFactory)
		factory=new  XmlBeanFactory(res);
		//get Bean (Target bean)
		bean=factory.getBean("wish");
			// type casting
		generator=(WishGenerator)bean;
		System.out.println("Result:::"+generator.generateWishMessage("raja"));
	}//main
}//class
