package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private   Date  date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public  String remainder(){
		if(date.compareTo(new Date(2017-1900,6,3))==0)
			return " Spring pratice Remainder";
		else if(date.compareTo(new Date(2017-1900,6,4))==0)
			return "Shopping Remainder";
		else
			return "No Remainders available";
	}
}
