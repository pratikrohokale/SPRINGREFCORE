package com.nt.beans;

import java.util.Set;

public class Faculty {
	private Set<Long> phones;

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		System.out.println(phones.getClass());
		return "Faculty [phones=" + phones + "]";
	}
	
	
	

}//class
