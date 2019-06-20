package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class DIAndLooseCouplingTest {

	public static void main(String[] args) {
		 //BeanFactory factory=null;
		 Flipkart fpkt=null;
		 ApplicationContext ctx=null;
		//create IOC container
		 //factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		  ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

/*		 //get Bean
		 fpkt=factory.getBean("flipkart",Flipkart.class);
		 //invoke methods
		 fpkt.shopping(new String[]{"shirt","trouser","belt"});
*/		

	}

}
