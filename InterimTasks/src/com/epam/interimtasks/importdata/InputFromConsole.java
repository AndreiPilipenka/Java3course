package com.epam.interimtasks.importdata;

import java.util.Scanner;

public class InputFromConsole {

	public static String inputFromKeyb() {
		@SuppressWarnings("resource")
		Scanner inputfromkeyb = new Scanner(System.in);
		String x="";
		System.out.print("������� ������� ����� ");
		if (inputfromkeyb.hasNext()) {
			x=inputfromkeyb.next();
		}
		System.out.println("������� ����� " + x);
			
	return x;}
}