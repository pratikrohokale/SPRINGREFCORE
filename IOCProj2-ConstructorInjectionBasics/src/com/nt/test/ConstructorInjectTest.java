package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class ConstructorInjectTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishGenerator wish=null;
		//Locate SpringBean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get BEan (main)
		//wish=(WishGenerator) factory.getBean("wish");
		wish=factory.getBean("wish",WishGenerator.class);
		System.out.println("Wish Message::"+wish.generateWishMessage("raja"));
	}//main
}//class
