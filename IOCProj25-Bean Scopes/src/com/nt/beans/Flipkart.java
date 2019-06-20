package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart:setCourier(-)");
		this.courier = courier;
	}


	public  void  shopping(String items[]){
		float billAmt=0.0f;
		Random rad=null;
		int oid=0;
		//calc bill Amt
		billAmt=items.length*500;
		//generate OrderId
		rad=new Random();
		oid=rad.nextInt(200000);
		System.out.println("OrderId "+oid+" bill Amount is"+billAmt+" items are "+Arrays.toString(items));
		//use Courier service for delivery
		 //dtdc.deliver(oid);
		courier.deliver(oid);
	}//method
}//class
