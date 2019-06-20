package com.nt.bpp;
 
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
      System.out.println("BPP:postProcessAfterInitialization(-,-)");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean ,String id) throws BeansException {
		System.out.println("BPP:postProcessBeforeInitialization(-,-)");
		return bean;
	}

}
