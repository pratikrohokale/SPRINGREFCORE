package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class Person {
	private String[] hobies;
	private Date dates[];

	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}
	
	public void setDates(Date[] dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "Person [hobies=" + Arrays.toString(hobies) + ", dates=" + Arrays.toString(dates) + "]";
	}


}//class
