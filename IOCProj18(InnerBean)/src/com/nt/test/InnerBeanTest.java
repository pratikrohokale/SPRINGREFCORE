package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bat;
import com.nt.beans.Batsman;

public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Batsman  man1=null, man2=null;
	   //create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 //get Beans
		man1=factory.getBean("dhoni",Batsman.class);
		man1.doBatting();
		System.out.println("----------------------------------");
		man2=factory.getBean("virat",Batsman.class);
		man2.doBatting();
		
		

		
	}
}
