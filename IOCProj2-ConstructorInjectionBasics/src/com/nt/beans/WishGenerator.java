package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;
	
	public void setDate(Date date) {
		System.out.println("WishGenerator:setDate(-)");
		this.date = date;
	}

	public WishGenerator(Date date) {
		System.out.println("WishGenerator:1 -param constructor");
		this.date = date;
	}
	
	public String  generateWishMessage(String uname){
		System.out.println("WishGenerator:generateWishMessage(-):::"+date);
		int hour=0;
		//get current month
		hour=date.getHours();
		if(hour<=12)
			  return "Good Morning::"+uname;
		else if(hour<=16)
			  return "Good AfterNoon::"+uname;
		else if(hour<=20)
			return "Good Evening::"+uname;
		else
			return "Good Night::"+uname;
	}//method

}//class
