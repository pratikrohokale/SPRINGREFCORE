package com.nt.pe;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class IntrAmtDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=0.0f,rate=0.0f,time=0.0f;
		IntrAmtDetails details=null;
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		System.out.println(pAmt+"  "+rate+"   "+time);
		//create IntrAmtDetails class object
		details=new IntrAmtDetails();
		details.setpAmt(pAmt); details.setTime(time); details.setRate(rate);
		//set the above to Bean proeprty
		setValue(details);
	}//method
}//class
