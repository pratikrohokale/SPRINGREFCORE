package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.PersonBO;

public class DOJPostProccessor implements BeanPostProcessor {

	public DOJPostProccessor() {
		System.out.println("DOJPostProcessor");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		System.out.println("postProcessBeforeInitialization(-,-)");
	  if(bean instanceof PersonBO){
		  ((PersonBO) bean).setDoj(new Date());
	  }
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		System.out.println("postProcessAfterInitialization(-,-)");
		return bean;
	}

	

}
