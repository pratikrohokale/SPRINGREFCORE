package com.nt.beans;

public class Bike {
	   private int id;
	   private String make;
	   private String color;
	   private String engineCC;
	   private String engineNo;
	   private int gearsCount;
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setGearsCount(int gearsCount) {
		this.gearsCount = gearsCount;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", make=" + make + ", color=" + color + ", engineCC=" + engineCC + ", engineNo="
				+ engineNo + ", gearsCount=" + gearsCount + "]";
	}
	
}
