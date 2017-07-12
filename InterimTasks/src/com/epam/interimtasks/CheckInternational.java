package com.epam.interimtasks;

import java.util.Locale;
import java.util.ResourceBundle;

public class CheckInternational {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale l = new Locale("ru","RU");
	ResourceBundle rb = ResourceBundle.getBundle("resources.text", l);
	String s1 = rb.getString("Label");
	String s2 = rb.getString("Button");
	System.out.println("Button = "+s2+" "+"Label = " + s1);
	
	Locale l2 = new Locale("en","US");
	ResourceBundle rb1 = ResourceBundle.getBundle("resources.text", l2);
	String s3 = rb1.getString("Label");
	String s4 = rb1.getString("Button");
	System.out.println("Button = "+s3+" "+"Label = " + s4);}

	
	}


