package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.pe.IntrAmtDetailsEditor;

public class CustomPETestBF2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		IntrAmtCalculator iac=null;
 		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//add Custom PropertyEditorRegistrar with IOC Container
		factory.addPropertyEditorRegistrar( registry->{
				registry.registerCustomEditor(IntrAmtDetails.class,new IntrAmtDetailsEditor());
			});
		
		//get Bean
		iac=factory.getBean("iac",IntrAmtCalculator.class);
		System.out.println("Intr Amount:::"+iac.calcIntrAmount());
	}//main
}//class
