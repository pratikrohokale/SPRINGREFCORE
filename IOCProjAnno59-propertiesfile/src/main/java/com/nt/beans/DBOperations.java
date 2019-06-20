package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Named("db")
public class DBOperations {
	@Value("${jdbc.driver}")
	private String driverClass;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String dbuser;
	@Value("${jdbc.pwd}")
	private String dbpwd;
	@Value("${java.vm.specification.vendor}")
	private String vendor;

	@Override
	public String toString() {
		return "DBOperations [driverClass=" + driverClass + ", url=" + url + ", dbuser=" + dbuser + ", dbpwd=" + dbpwd
				+ ", vendor=" + vendor + "]";
	}
}
