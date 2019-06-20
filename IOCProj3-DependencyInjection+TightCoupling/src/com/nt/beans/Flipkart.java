package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//private DTDC dtdc;
	private BlueDart blueDart;
	
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}

	public void setBlueDart(BlueDart blueDart) {
		System.out.println("Flipkart:setBlueDart(-)");
		this.blueDart = blueDart;
	}

	/*public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	*/
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
		blueDart.deliver(oid);
	}//method
}//class
