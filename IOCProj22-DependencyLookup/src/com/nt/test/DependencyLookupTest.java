package com.nt.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Cricketer;


public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Cricketer player=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
        //get Bean
		player=factory.getBean("player",Cricketer.class);
		player.batting();
		player.bowling();
		player.fielding();
	}//main
}//class
