package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.JobSeeker;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value=AppConfig.class)
public class IocBootProj2StrategyPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		JobSeeker js=null;
		ctx=SpringApplication.run(IocBootProj2StrategyPatternApplication.class, args);
		//get Bean
		js=ctx.getBean("js",JobSeeker.class);
		System.out.println(js.getSoftwareJob());
		//close contianer
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
