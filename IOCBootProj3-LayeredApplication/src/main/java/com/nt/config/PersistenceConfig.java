package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	/*@Value("${jdbc.driver}")
	private  String driver;
	@Value("${jdbc.url}")
	private  String url;
	@Value("${jdbc.user}")
	private  String user;
	@Value("${jdbc.pwd}")
	private  String pwd;*/

	


	/*@Bean
	public  DataSource  createDataSource(){
		DriverManagerDataSource ds=null;
		ds=new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(pwd);
		return ds;
	}*/
	
}
