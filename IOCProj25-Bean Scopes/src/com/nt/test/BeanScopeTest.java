package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class BeanScopeTest {

	public static void main(String[] args) {
		 BeanFactory factory=null;
		 Flipkart fpkt=null,fpkt1=null;
		//create IOC container
		 factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 //get Bean
		 fpkt=factory.getBean("fpkt",Flipkart.class);
		 fpkt1=factory.getBean("fpkt",Flipkart.class);
		 System.out.println("fpkt hashCode:"+fpkt.hashCode());
		 System.out.println("fpkt1 hashCode:"+fpkt1.hashCode());
		 
		 System.out.println("fpkt and fpkt1 refering to same object?"+(fpkt==fpkt1));
		
	}

}
