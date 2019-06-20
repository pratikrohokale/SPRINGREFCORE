package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18nApp {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		JFrame jframe=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//prepare Locale (language,country)
		locale=new Locale(args[0],args[1]);
		//locate Properties file based given Locale
		bundle=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//create JFrame
		jframe=new JFrame("I18n App");
		//create Buttons
		btn1=new JButton(bundle.getString("label1"));
		btn2=new JButton(bundle.getString("label2"));
		btn3=new JButton(bundle.getString("label3"));
		btn4=new JButton(bundle.getString("label4"));
		//add buttons to frame
		jframe.add(btn1);
		jframe.add(btn2);
		jframe.add(btn3);
		jframe.add(btn4);
		jframe.setLayout(new FlowLayout());
		//speify size
		jframe.pack();
		jframe.setVisible(true);
	}//main
}//class
