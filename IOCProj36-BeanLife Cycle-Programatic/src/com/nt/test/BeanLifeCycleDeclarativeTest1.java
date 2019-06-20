package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleDeclarativeTest1 {

	public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		 BeanDefinitionReader reader=null;
		 Resource res=null;
		 CheckVotingElgibility voter=null;
		 //locate spring bean cfg file
		 res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create IOC Container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions(res);
		 //get Bean
		 voter=factory.getBean("voter",CheckVotingElgibility.class);
		 //invoke the method
		 System.out.println("Result::"+voter.checkVotingElgibility());
		 //close container
		factory.destroySingletons();
	}

}
