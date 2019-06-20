package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	private  int year;
	private  int month;
	private int date;

	
	public void setYear(int year) {
		this.year = year;
	}

	
	public void setMonth(int month) {
		this.month = month;
	}

	
	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public Date getObject() throws Exception {
		Date dt=null;
		System.out.print("DFB:getObject()");
		dt=new Date(year-1900,month,date);
		System.out.println("Generated Date"+dt);
		return dt;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.print("DFB:getObjectType()");
		return Date.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("DFB:isSingleton()");
		return true;
	}

}
