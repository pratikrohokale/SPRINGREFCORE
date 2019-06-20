package com.nt.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class AadharDetails {
	private  int ano;
	private String name;
	private Date dob;
	private String[] verifiers;
	private  long phones[];
	private  File  photoPath;
	private float  age;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String[] getVerifiers() {
		return verifiers;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public long[] getPhones() {
		return phones;
	}
	public void setPhones(long[] phones) {
		this.phones = phones;
	}
	public File getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AadharDetails [ano=" + ano + ", name=" + name + ", dob=" + dob + ", verifiers="
				+ Arrays.toString(verifiers) + ", phones=" + Arrays.toString(phones) + ", photoPath=" + photoPath
				+ ", age=" + age + "]";
	}
	

}
