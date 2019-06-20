package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nTestApp {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 Locale locale=null,locale1=null;;
		 String s1=null,s2=null,s3=null,s4=null;
		 JButton btn1=null,btn2=null,btn3=null,btn4=null;
		 JFrame frame=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //prepare Locale object
		 locale=new Locale(args[0],args[1]);
		 locale1=new Locale(args[2],args[3]);
		 
		 //get MEssages
		 s1=ctx.getMessage("label1",new String[]{"me"},"insert-d",locale);
		 s2=ctx.getMessage("label2",null,"update-d",locale);
		 s3=ctx.getMessage("label3",null,"delete-d",locale1);
		 s4=ctx.getMessage("label4",null,"view-d",locale1);
		 //create FRame
		 frame=new JFrame();
		 frame.setLayout(new FlowLayout());
		
		 //create Button Comps
		 btn1=new JButton(s1);
		 btn2=new JButton(s2);
		 btn3=new JButton(s3);
		 btn4=new JButton(s4);
		 //add Button Comps
		 frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
		 //make Visibility true
		 frame.pack();
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//main
}//class
